public class Rectangle {
    double length;
    double width;

    Rectangle(double length, double widht) {
        this.length = length;
        this.width = widht;
    }

    double rectPerimeter() {
        return 2*(length + width);
    }

    double rectArea() {
        return length * width;
    }
}

