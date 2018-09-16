public class Square {
    double side;

    Square (double side) {
        this.side = side;
    }

    double squareArea() {
        return side * side;
    }

    double squarePerimeter() {
        return 4 * side;
    }
}
