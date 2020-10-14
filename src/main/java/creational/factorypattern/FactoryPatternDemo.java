package creational.factorypattern;

/*In Factory pattern, we create object without exposing the creation logic
    to the client and refer to newly created object using a common interface.*/

public class FactoryPatternDemo {
    private static Integer x = 10;
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("Rectangle");
        Shape shape3 = shapeFactory.getShape("Square");
        shape2.draw();
        shape3.draw();
    }
}
