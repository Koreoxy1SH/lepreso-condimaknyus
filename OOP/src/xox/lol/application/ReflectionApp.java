package xox.lol.application;

import xox.lol.data.CreateUserRequest;
import xox.lol.util.ValidationUtil;

public class ReflectionApp {
   public static void main(String[] args) {
    

    CreateUserRequest request = new CreateUserRequest();
    request.setUsername("Budi");
    request.setPassword("KSA");

    ValidationUtil.validationReflection(request);

   } 
}
