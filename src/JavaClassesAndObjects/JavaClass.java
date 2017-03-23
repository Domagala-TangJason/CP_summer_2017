package JavaClassesAndObjects;

/**
 * Created by Jason on 3/21/2017.
 */

class Person {
    public Person (){
        System.out.println("This is the constructor");
    }
    public Person (String name){
        System.out.println(name);
        // makes a constructor that must be later defined called name, and prints it
    }
}
public class JavaClass {
    public static void main(String[] args) {

        Person person1 = new Person("Jason");
        // prints out the constructor that is a defined piece of the Person class, first is not run
    }
}
