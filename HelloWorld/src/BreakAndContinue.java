public class BreakAndContinue {

    public static void main(String[] args) {
        
        // EXAMPLE CODE BREAK
        var x = 1;
        while (true) {
            System.out.println("Perulangan ke-" + x);
            x++;

            if(x > 10) {
                break;
            }
        };

        //EXAMPLE CODE CONTINUE
        for (int z = 1; z <= 100; z++) {
            
            if(z % 2 == 0) {
                continue;
            }
            
            System.out.println("Perulangan ganjil " + z);
        };
    }
    
}
