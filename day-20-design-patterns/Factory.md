📌 Definition

The Factory Design Pattern is a creational pattern that provides an interface for creating objects but allows subclasses or factory classes to decide which object to instantiate.

It helps in hiding object creation logic and promotes loose coupling.

🎯 Intent
Encapsulate object creation logic
Reduce dependency on concrete classes
Promote flexibility and scalability
Follow Open/Closed Principle (OCP)
🧠 Real-World Analogy

Think of a restaurant 🍽️

You order food (Pizza, Burger)
You don’t cook it yourself
Kitchen (factory) decides how to prepare it
🏗️ Core Components
1. Product Interface
interface Shape {
    void draw();
}

Defines a common interface for all objects.

2. Concrete Products
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

Actual implementations of the product.

3. Factory Class
class ShapeFactory {
    public static Shape getShape(String type) {
        if (type.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}

Encapsulates object creation logic.

4. Client Code
public class Main {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape("RECTANGLE");
        shape2.draw();
    }
}

Uses factory instead of new.

🧪 Basic Implementation (Simple Factory)
class ShapeFactory {
    public static Shape getShape(String type) {
        if (type.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        if (type.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}
⚠️ Issue
Uses if-else (not scalable)
Not true Factory Method pattern
🔥 Problem Without Factory
if (type == 1) {
    vehicle = new TwoWheeler();
} else if (type == 2) {
    vehicle = new FourWheeler();
}
Issues
Tight coupling
Hard to extend
Violates Single Responsibility Principle
🚀 Factory Method Implementation
1. Product
abstract class Vehicle {
    abstract void printVehicle();
}
2. Concrete Products
class TwoWheeler extends Vehicle {
    void printVehicle() {
        System.out.println("I am two wheeler");
    }
}

class FourWheeler extends Vehicle {
    void printVehicle() {
        System.out.println("I am four wheeler");
    }
}
3. Factory Interface
interface VehicleFactory {
    Vehicle createVehicle();
}
4. Concrete Factories
class TwoWheelerFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}

class FourWheelerFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}
5. Client
class Client {
    private Vehicle vehicle;

    public Client(VehicleFactory factory) {
        vehicle = factory.createVehicle();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
6. Main
public class Main {
    public static void main(String[] args) {
        Client c1 = new Client(new TwoWheelerFactory());
        c1.getVehicle().printVehicle();

        Client c2 = new Client(new FourWheelerFactory());
        c2.getVehicle().printVehicle();
    }
}
⚖️ Comparison Table
Approach	Loose Coupling	Scalable	Complexity
Direct new	❌	❌	Low
Simple Factory	⚠️ Partial	⚠️ Medium	Medium
Factory Method	✅	✅	High
✅ Advantages
Loose coupling
Centralized object creation
Easy to extend
Better maintainability
❌ Disadvantages
More classes
Increased complexity
Overkill for small applications
🎯 Use Cases
Notification systems (Email, SMS, Push)
Payment gateways (UPI, Card, PayPal)
UI components (Buttons, Dialogs)
Logging frameworks
Game development (Enemy creation)
🧠 Interview Questions
Q1: Why Factory Pattern?

To remove direct object creation and reduce coupling

Q2: Difference between Factory and Abstract Factory?
Factory → creates one product
Abstract Factory → creates families of products
Q3: Factory vs Simple Factory?
Simple Factory uses if-else
Factory Method uses polymorphism
Q4: Where is it used?

Frameworks, APIs, object creation layers

🔥 Key Takeaway

Avoid using new everywhere.

👉 Prefer:

Factory Method for scalable design
Simple Factory for small use cases