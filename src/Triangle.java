public class Triangle {
    double side1;
    double side2;
    double base;
    double height;

    Triangle (double side1, double side2, double base) {
        this.side1 = side1;
        this.side2 = side2;
        this.base = base;
    }

    double trianglePerimeter() {
        return side1 + side2 + base;
    }

    Triangle (double base, double height) {
        this.base = base;
        this.height = height;
    }

    double triangleArea() {
        return (height * base)/2;
    }

}

