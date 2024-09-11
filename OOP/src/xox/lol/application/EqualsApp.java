package xox.lol.application;

public class EqualsApp {

    public static void main(String[] args) {
        
        String first = "budi";

        first = first + " " + "Dodit";

        System.out.println(first);

        String second = "budi Dodit";
        System.out.println(second);

        System.out.println(first == second);

        // example code equals
        System.out.println(first.equals(second));
    }
    
}
