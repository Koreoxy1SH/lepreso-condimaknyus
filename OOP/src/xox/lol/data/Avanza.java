package xox.lol.data;

public class Avanza implements Car, IsMaintenance{

    public void drive () {
        System.out.println("avanza drive");
    }

    public int getTire() {
        return 4;
    }

    public boolean IsMaintenance() {
        return false;
    }

    public String getBrand() {
        return "Toyota";
    }

    public boolean isBig() {
        return true;
    }
    
}
