package xox.lol.application;

import xox.lol.data.LoginRequest;

public class RecordApp {

    public static void main(String[] args) {
        
        LoginRequest loginRequest = new LoginRequest("Budi", "123");

        System.out.println(loginRequest);
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Budi"));
        System.out.println(new LoginRequest("Budi", "123"));
    }
    
}
