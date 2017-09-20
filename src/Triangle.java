public class Triangle {
    double a;
    double b;
    double c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double calculatePerimeter() {
        ShapeCalculator shape = new ShapeCalculator();
        double res = shape.trianglePerimeter(this);
        return res;
    }
}
