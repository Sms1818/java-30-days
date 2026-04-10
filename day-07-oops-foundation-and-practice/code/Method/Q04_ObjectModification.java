// In this program, we have a Person class with a name attribute. We create an instance of Person and pass it to the modifyPerson method. The modifyPerson method changes the name attribute of the Person object. Since for objects, java passes copy of a reference as a value, we are able to modify the original object inside the method. So when we print the name attribute of the Person object after calling the modifyPerson method, we see the modified name.

// Output of the program will be:
// Before modification: John
// Inside modifyPerson method: Doe
// After modification: Doe

class Person{
    String name;
}
public class Q04_ObjectModification {
    public void modifyPerson(Person p){
        p.name="Doe";
        System.out.println("Inside modifyPerson method: "+p.name);
    }
    public static void main(String[] args) {
        Person p=new Person();
        p.name="John";
        System.out.println("Before modification: "+p.name);

        Q04_ObjectModification obj=new Q04_ObjectModification();
        obj.modifyPerson(p);
        System.out.println("After modification: "+p.name);
    }
}
