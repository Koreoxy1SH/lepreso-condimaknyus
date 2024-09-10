public class RecursiveMethod {

    public static void main(String[] args) {

       System.out.println(factorialLoop(5));

       System.out.println(factorialRecursive(5));
       
       //loop(100000);
     
    }

    // MENGGUNAKAN FOR LOOP 
    static int factorialLoop (int value) {
        var result = 1;

        for(var x = 1; x <= value; x++) {
            result *= x;
        }

        return result;
    }

    //MENGGUNAKAN RECURSIVE METHOD
    static int factorialRecursive(int value) {
        if(value == 1) {
            return 1;
        } else {
            return value * factorialLoop(value - 1);
        }
    }

    //CONTOH CODE ERROR STACK OVERFLOW
    static void loop (int value ) {
        if(value == 0) {
            System.out.println("Selesai");
        }else {
            System.out.println("Loop " + value);
            loop(value - 1);
        }
    }
    
}
