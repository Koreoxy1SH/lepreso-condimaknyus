public class MethodReturnValue {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        var hasil = sum(a,b);

        System.out.println(hasil);

        System.out.println(sum(200, 200));

        System.out.println(hitung(10, "+", 10));
        System.out.println(hitung(10, "-", 10));
        
    }

   static int sum (int value1, int value2) {
    var total = value1 + value2;
    return total;
   }

   static int hitung(int value1, String operasi, int value2) {
    switch (operasi) {
        case "+":
            return value1 + value2;
        case "-":
            return value1 - value2;
        default:
            return 0;
    }
   }
    
}
