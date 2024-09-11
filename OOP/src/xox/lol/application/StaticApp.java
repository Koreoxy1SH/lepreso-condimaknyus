package xox.lol.application;

import xox.lol.data.Application;
import static xox.lol.data.Constant.*;
import xox.lol.data.Country;
import xox.lol.util.MathUtil;

public class StaticApp {

    public static void main(String[] args) {
        

        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(MathUtil.sum(1,1,1,1));

        Country.City city = new Country.City();
        city.setName("Bandung");

        System.out.println(city.getName());

        System.out.println(Application.PROCESSORS);

    }
    
}
