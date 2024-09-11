public class PersonApp {
   public static void main(String[] args) {
    
    var person1 = new Person("dudi", "jlsada");
    Person person2 = new Person("toti", "bancdung");
    Person person3 = new Person("Joko");
   

    System.out.println(person1.name);
    System.out.println(person2.address);
    System.out.println(person2.country);

    person1.sayHello("Buddi");
    person1.sayAddress(person1.name);
   } 
}
