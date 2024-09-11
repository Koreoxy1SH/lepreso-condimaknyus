package xox.lol.application;

import xox.lol.data.City;
import xox.lol.data.Location;

public class LocationApp {

    public static void main(String[] args) {
        // var location = new Location(); ini errror

        var city = new City();
        city.name = "Bandung";

        System.out.println(city.name);
    }
    
}
