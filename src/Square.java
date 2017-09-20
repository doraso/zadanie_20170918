public class Square {
    double a;

    Square(double a) {
        this.a = a;
    }

    double calculateArea() {
        ShapeCalculator shape = new ShapeCalculator();
        double res = shape.squareArea(this);
        return res;
    }
}