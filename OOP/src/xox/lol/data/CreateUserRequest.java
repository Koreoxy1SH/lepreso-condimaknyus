package xox.lol.data;

import xox.lol.annotation.Notblank;

public class CreateUserRequest {
   
    @Notblank
    private String username;

    @Notblank
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
