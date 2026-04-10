// In this program, we have a Person class with a name attribute. The Q06_ReturnObject class has a method createPerson that takes a name as input, creates a new Person object, sets the name, and returns the object. In the main method, we create an instance of Q06_ReturnObject, call the createPerson method to create a Person named "John", and print the name of the created person.

// The object is created in heap memory inside the method.
// The reference to this object is returned to the caller.
// The reference is copied (pass-by-value) and assigned to variable p in main.
// Both refer to the same object.

// Output of the program will be:
// Created person: John


class Person{
    String name;
}
public class Q06_ReturnObject {
    public Person createPerson(String name){
        Person p=new Person();
        p.name=name;
        return p;
    }
    public static void main(String[] args) {
        Q06_ReturnObject obj = new Q06_ReturnObject();
        Person p = obj.createPerson("John");
        System.out.println("Created person: " + p.name);
    }
}
