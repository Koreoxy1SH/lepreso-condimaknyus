package xox.lol.application;

import xox.lol.data.Product;

public class Application {
    public static void main(String[] args) {
        
        Product product = new Product("Motor", 30);
        System.out.println(product.name);
    }
    
}
