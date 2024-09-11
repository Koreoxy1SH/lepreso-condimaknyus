package xox.lol.application;

import xox.lol.data.Avanza;
import xox.lol.data.Car;

public class CardApp {
    public static void main(String[] args) {
        
        Car car = new Avanza();

        System.out.println(car.getTire());
        car.drive();
    }
    
}
