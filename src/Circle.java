public class Circle {
    double radius;

    Circle (double radius) {
        this.radius = radius;
    }

    double circleArea() {
        return 2 * (radius * radius);
    }

    double circlePerimeter() {
        return 2 * 3.14 * radius;
    }
}

