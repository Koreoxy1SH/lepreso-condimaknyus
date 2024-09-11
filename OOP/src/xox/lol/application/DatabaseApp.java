package xox.lol.application;

import xox.lol.error.DatabaseError;

public class DatabaseApp {

    public static void main(String[] args) {
        
        connectDatabase("Dudi",null);
        System.out.println("Success");

    }

    public static void connectDatabase(String username, String password) {
        if(username == null || password == null) {
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }
    
}
