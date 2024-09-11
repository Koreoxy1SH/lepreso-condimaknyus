package xox.lol.data;

public record LoginRequest(String username, String password) {

    public LoginRequest{
        System.out.println("Membuat object login reueqst");
    }

    public LoginRequest(String username) {
        this(username, "");
    }

    public LoginRequest(){
        this("", "");
    }

    public void sayHello() {
    }
    
}
