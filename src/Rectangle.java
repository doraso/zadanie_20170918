public class Rectangle {
    double a;
    double b;

    Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    double calculatePerimeter() {
        ShapeCalculator shape = new ShapeCalculator();
        double res = shape.rectPerimeter(this);
        return res;
    }
}
