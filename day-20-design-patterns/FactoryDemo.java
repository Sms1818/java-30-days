enum ShapeType {
    CIRCLE,
    RECTANGLE,
    SQUARE,
    TRIANGLE
}

interface Shape{
    void draw();
}

class Circle implements Shape{
    @Override
    public void draw(){
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}

class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}

// Simple Factory Method
// class ShapeFactory{
//     public static Shape getShape(ShapeType type){
//         System.out.println("Factory: Creating shape -> " + type);
//         if(type==null) return null;
//         switch(type){
//             case CIRCLE:
//                 return new Circle();
//             case RECTANGLE:
//                 return new Rectangle();
//             case SQUARE:
//                 return new Square();
//             case TRIANGLE:
//                 return new Triangle();
//             default:
//                 throw new IllegalArgumentException("Unknown shape type");
//         }
//     }
// }


// Proper Factory Method
interface ShapeFactory{
    Shape createShape();
}
class CircleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}

class RectangleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}

class SquareFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }
}

class TriangleFactory implements ShapeFactory{
    @Override
    public Shape createShape(){
        return new Triangle();
    }
}




public class FactoryDemo {
    public static void main(String[] args) {
        // Shape shape1=ShapeFactory.getShape(ShapeType.CIRCLE);
        // shape1.draw();

        // Shape shape2 = ShapeFactory.getShape(ShapeType.RECTANGLE);
        // shape2.draw();

        // Shape shape3 = ShapeFactory.getShape(ShapeType.SQUARE);
        // shape3.draw();

        // Shape shape4 = ShapeFactory.getShape(ShapeType.TRIANGLE);
        // shape4.draw();

        ShapeFactory factory1=new CircleFactory();
        Shape shape1=factory1.createShape();
        shape1.draw();

        ShapeFactory factory2 = new RectangleFactory();
        Shape shape2 = factory2.createShape();
        shape2.draw();

        ShapeFactory factory3 = new SquareFactory();
        Shape shape3 = factory3.createShape();
        shape3.draw();

        ShapeFactory factory4 = new TriangleFactory();
        Shape shape4 = factory4.createShape();
        shape4.draw();

    }
}