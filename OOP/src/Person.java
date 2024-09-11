class Person {
    
    String name;
    String address;

    final String country = "Indonesia";

    // CONSTRUCTOR
    Person(String name, String address) {
       this.name = name;
        this.address = address;

    }

    //CONSTRUCTOR OVERLOADING
    // MEMILIKI NAMA CONSTRUCTOR YANG SAMA TAPI TERDAPAT JUMLAH PARAMETER YANG BERBEDA
    Person(String paramName) {
        this(paramName, null);
    }

    //CONSTRUCTOR OVERLOADING
    Person() {
        this(null);

    }

    void sayHello(String name) {
        System.out.println("Hello " + this.name+", My name is " + name);
    }

    void sayAddress(String name) {
        System.out.println("Hello " + this.name + " alamat anda di " + address);
    }
}

