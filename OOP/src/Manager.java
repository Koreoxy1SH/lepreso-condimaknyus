class Manager extends Employee {
    
    String company;

    Manager(String name, String company) {
        super(name);
        this.company = company;
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", my name is manager" + this.name);
    }
    
}

class VicePresident extends Manager {

    void sayHello(String name) {
        System.out.println("Hello " + name + ", my name is vp" + this.name);
    }

    VicePresident(String name, String company) {
        super(name, company);
        
    }
    

}
