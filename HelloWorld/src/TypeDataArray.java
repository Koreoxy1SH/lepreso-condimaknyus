public class TypeDataArray {
    public static void main(String[] args) {

        String[] name;
        name = new String[3];
        name[0] = "Budi";
        name[1] = "Dudi";
        name[2] = "Yuyi";

        System.out.println(name[0]);


        name[0] = "brian";
        System.out.println(name[0]);

        String[] alamat = new String[2];

        int[] arrayInt = new int[] {
            1, 2, 3, 4, 5
        };

        String[] nama = new String[] {
            "Budi",
            "dudi",
            "cuki"
        };

        System.out.println(nama.length);


        // ARRAY DIDALAM ARRAY
        String[][] members ={
            {"dudi", "keko", "sldsd"},
            {"SADA", "ASDAS", "ADSAD"}
        };

        System.out.println(members[0][1]);

        String[][][] color ={
            {
                {"dudi", "xoxo"}
            }
        };

        System.out.println(color[0][0][1]);

        
    }
    
}
