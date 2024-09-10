public class TernaryOperator {

    public static void main(String[] args) {
        var nilai = 75;
        String ucapan;

        if(nilai >= 75) {
            ucapan = "Lululs";
        } else {
            ucapan = "tidak lulus";
        }

        System.out.println(ucapan);

        // EXAMPLE CODE TERNARY OPERATOR
        var x = 75;
        String word = x >= 75 ? "Lulus" : "Tidak lulus";

        System.out.println(word);
    }
    
}
