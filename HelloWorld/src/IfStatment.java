public class IfStatment {

    public static void main(String[] args) {
        
        var nilai = 75;
        var absen = 75;

        if(nilai >= 80 && absen >= 80) {
            System.out.println("Nilai A");
        } else if (nilai >= 75 && absen >= 75) {
            System.out.println("Nilai B");
        }
        else {
            System.out.println("Tidak Lulus");
        }
    }
    
}
