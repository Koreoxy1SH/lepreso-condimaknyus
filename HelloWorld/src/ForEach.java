public class ForEach {

    public static void main(String[] args) {
        
        
        String[] name = {
            "Budi",
            "Santoso",
            "Putri",
            "Bujang"
        };

        //Example Code without For Each
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }

        System.out.println("===================");

        // Example code For Each
        for(var names : name) {
            System.out.println(names);
        }
    }
    
}
