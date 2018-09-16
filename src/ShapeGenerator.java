public class ShapeGenerator {
    public static void main(String[] args) {

        Square square = new Square(5);
        System.out.println("Square area = " + square.squareArea());
        System.out.println("Square perimeter = " + square.squarePerimeter());

        Circle circle = new Circle(2.1);
        System.out.println("Cricle area = " + circle.circleArea());
        System.out.println("Circle perimeter = " + circle.circlePerimeter());

        Triangle triangle = new Triangle(12, 14, 11);
        System.out.println("Triangle perimeter = " + triangle.trianglePerimeter());
        Triangle triangle1 = new Triangle(12, 23);
        System.out.println("Triangle area = " + triangle1.triangleArea());

        Rectangle rectangle = new Rectangle(1.5, 1.9);
        System.out.println("Rectangle perimeter = " + rectangle.rectPerimeter());
        System.out.println("Rectangle area = " + rectangle.rectArea());
        
    }
}
