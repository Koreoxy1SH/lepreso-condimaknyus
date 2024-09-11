package xox.lol.application;

import xox.lol.data.HelloWord;

public class HelloWordApp {

    public static void main(String[] args) {
        
        HelloWord english = new HelloWord() {
            
            public void sayHello(){
                System.out.println("Hello");
            }

            public void sayHello(String name) {
                System.out.println("Hello " + name);

            }
        };

        

    }
    
}
