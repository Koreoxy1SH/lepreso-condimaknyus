public class TypeDataNotPrimitive {

    public static void main(String[] args) {
        Integer angka = 0;
        Boolean bollean =null;
        Float floatx = null;
            
        System.out.println(angka);
        System.out.println(bollean);
        System.out.println(floatx);

        // KONVERSI PRITIMIVE TO NOT PRIMITIVEo
        int iniInt = 100;
        Integer iniInteger = iniInt;
        System.out.println(iniInteger);

        short iniShort = iniInteger.shortValue(); 
        long inilong3= iniInteger.longValue();
    }
    
}
