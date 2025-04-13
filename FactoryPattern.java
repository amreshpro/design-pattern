interface Shape{
void draw();
}

 class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

 class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class ShapeFactory{
    public Shape getShape(String shapeType){
        if (shapeType == null) return null;
        if (shapeType.equalsIgnoreCase("CIRCLE")) return new Circle();
        if (shapeType.equalsIgnoreCase("RECTANGLE")) return new Rectangle();
        return null;
    }
}


public class FactoryPattern {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShape("CIRCLE");
        shape1.draw(); // Output: Drawing a Circle

        Shape shape2 = factory.getShape("RECTANGLE");
        shape2.draw(); // Output: Drawing a Rectangle 
    }
}