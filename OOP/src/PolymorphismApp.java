public class PolymorphismApp {

    public static void main(String[] args) {
        
        Employee employe = new Employee("Employee");
        employe.sayHello("Tuti");

        employe = new Manager("das", "sada");
        employe.sayHello("Rudi");
    
        employe = new VicePresident("xxuxi", "Bujang");
        employe.sayHello("Juji");

        sayHello(new Employee("Tuti"));
        sayHello(new Employee("joko"));
        sayHello(new Employee("kuda"));
    }

    static void sayHello(Employee employe) {
        if(employe instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employe;
            System.out.println("Hello " + vicePresident.name);
        } else if (employe instanceof Manager) {
            Manager manager = (Manager) employe;
            System.out.println("Hello " + manager.name);
        } else {
            System.out.println("Hello " + employe.name);
        }
        
    }
    
}
