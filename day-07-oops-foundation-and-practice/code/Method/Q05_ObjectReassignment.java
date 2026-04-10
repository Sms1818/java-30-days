// Java is pass-by-value. When passing an object, a copy of the reference is passed.Inside the method, reassigning the reference (p = new Person()) only changes the local copy.The original reference in main still points to the original object.Therefore, changes are not reflected outside the method.

// Output of the program will be:
// Before reassignment: John
// Inside reassignPerson method: Doe
// After reassignment: John

class Person{
    String name;
}
public class Q05_ObjectReassignment {
    public void reassignPerson(Person p){
        p=new Person();
        p.name="Doe";
        System.out.println("Inside reassignPerson method: "+p.name);
    }
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "John";
        System.out.println("Before reassignment: " + p.name);

        Q05_ObjectReassignment obj = new Q05_ObjectReassignment();
        obj.reassignPerson(p);
        System.out.println("After reassignment: " + p.name);
    }
}

