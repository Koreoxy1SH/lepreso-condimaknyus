public class MethodVariableArgument {
    public static void main(String[] args) {

        int[] values ={80,80,80,80};

        sayCongrats("kucing", values);

        selamat("Kodok", 80,80,80,80);
       
    }

    // Example Code method without variable argument
    static void sayCongrats(String name, int[] values) {

        int total = 0;
        for(var value : values) {
            total += value;
        }

        int finalValue = total / values.length;

        if( finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda lulus");
        }else {
            System.out.println(name + " Anda tidak lulus");
        }
    };

    //Example Code method variable argument
    static void selamat(String name, int... values) {
         int total = 0;
        for(var value : values) {
            total += value;
        }

        int finalValue = total / values.length;

        if( finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda lulus");
        }else {
            System.out.println(name + " Anda tidak lulus");
        }
    }
    
}
