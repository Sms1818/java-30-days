// In this proram, we have a Person class with a name attribute. The Q07_ObjectModifyAndReturn class has a method updatePerson that takes a Person object as input, modifies its name attribute, and returns the modified object. In the main method, we create an instance of Q07_ObjectModifyAndReturn, create a Person named "Original", and call the updatePerson method to update the person's name to "Updated". We then print the name of the original person and the returned person to show that both references point to the same modified object.
// The object is created in heap memory.
// The reference to this object is passed to the method.
// Inside the method, we modify the object's state and return the reference.
// The reference is copied (pass-by-value) and assigned to variable updatedPerson in main.
// Both p and updatedPerson refer to the same object, so changes are reflected in both.

// Output of the program will be:
// Before update: Original
// After update: Updated
// Returned person name: Updated

class Person{
    String name;
}
public class Q07_ObjectModifyAndReturn {
    public Person updatePerson(Person p){
        p.name="Updated";
        return p;
    }
    public static void main(String[] args) {
        Person p=new Person();
        p.name="Original";
        System.out.println("Before update: "+p.name);

        Q07_ObjectModifyAndReturn obj=new Q07_ObjectModifyAndReturn();
        Person updatedPerson=obj.updatePerson(p);
        System.out.println("After update: "+p.name);
        System.out.println("Returned person name: "+updatedPerson.name); 
    }
}
