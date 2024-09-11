package xox.lol.util;

import xox.lol.annotation.Notblank;
import xox.lol.data.LoginRequest;
import xox.lol.error.BlankException;
import xox.lol.error.ValidationException;
import java.lang.reflect.*;
import java.lang.IllegalAccessException;

public class ValidationUtil {
   
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException{
        if(loginRequest.username() == null){
            throw new NullPointerException("Username is null");
        }else if (loginRequest.username().isBlank()){
            throw new ValidationException("Username is blank");
        }else if(loginRequest.password() == null) {
            throw new NullPointerException("Pasword is null");
        }else if(loginRequest.password().isBlank()) {
            throw new ValidationException("Password is blank");
        }
    }

    public static void validateRuntime(LoginRequest loginRequest){
        if(loginRequest.username() == null){
            throw new NullPointerException("Username is null");
        }else if (loginRequest.username().isBlank()){
            throw new BlankException("Username is blank");
        }else if(loginRequest.password() == null) {
            throw new NullPointerException("Pasword is null");
        }else if(loginRequest.password().isBlank()) {
            throw new BlankException("Password is blank");
        }
    }

    public static void validationReflection(Object object) {
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for(var field : fields) {
            field.setAccessible(true);

            if(field.getAnnotation(Notblank.class) != null) {
                try {
                    String value = (String) field.get(object);

                    if(value == null || value.isBlank()) {
                        throw new BlankException("Field " + field.getName() + " is blank");
                    }

                } catch (IllegalAccessException exception) {
                    System.out.println("Tidak bisa mengakses field " + field.getName());
                }
            }
        }
    }
}
