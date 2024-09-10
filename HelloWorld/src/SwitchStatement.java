public class SwitchStatement {

    public static void main(String[] args) {
        
        var nilai = "D";

        switch (nilai) {
            case "A":
                System.out.println("Anda mendapat nilai A"); 
                break;
            case "B":
                System.out.println("Anda mendapat nilai B");
                break;
            case "C":
            case "D":
                System.out.println("Anda mendapat nilait yang cukup");
                break;
            default:
                System.out.println("Anda tidak mendapat nilai");
                break;
        }

        // SWITCH LAMBDA
        var lampu = "RED";
        
        switch (lampu) {
          case "RED" -> System.out.println("Berhenti");
          case "YELLOW", "KUNING" -> System.out.println("Hati-hati");
          case "GREEN" -> System.out.println("Jalan");
          default -> {
            System.out.println("Tetap Berhati-hati");
          }
        }

        var light = "GREEN";
        //String ucapan;

       String ucapan = switch (light){
            case "RED" : 
                yield "Berhenti";
            case "YELLOW", "KUNING" : 
                yield "Hati-hati";
            case "GREEN" : 
                yield "Jalan";
            default : 
                yield "Tetap Berhati-hati";
        };

        System.out.println(ucapan);
    }
    
}
