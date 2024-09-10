public class BooleanOperation {

    public static void main(String[] args) {
        var absen = 80;
        var nilaiAkhir = 75;

        var lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilai;

        System.out.println( lulus);
    }
    
}
