package xox.lol.application;

import xox.lol.data.LoginRequest;
import xox.lol.error.ValidationException;
import xox.lol.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        

        LoginRequest loginRequest = new LoginRequest("sadsa", "123");

        // try {
        //     ValidationUtil.validate(loginRequest);
        //     System.out.println("Data valid");
        // } catch (ValidationException e) {
        //     System.out.println("Data tidak valid : " + e.getMessage());
        // } catch (NullPointerException e) {
        //     System.out.println("Data null : " + e.getMessage());
        // }

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException | NullPointerException e) {
            System.out.println("Data tidak valid : " + e.getMessage());
        } finally {
            System.out.println("Selalu di eksekusi");
        }

        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("Sukses");

    }
    
}
