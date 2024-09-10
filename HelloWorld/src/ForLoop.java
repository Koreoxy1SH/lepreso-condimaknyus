public class ForLoop {

    public static void main(String[] args) {
        
 

        for( int x = 0; x <= 10; x++){
            System.out.println("Perulangan ke " + x);
        }

        // Perualangan tanpa henti
        /* 
        for(;;) {
            System.out.println("Perulangan tak terhenti");
        }
        */

        int counter = 1;
        for(; counter <= 5 ;){
            System.out.println("Perulangan " + counter);

            counter++;
        }
    }
    
}
