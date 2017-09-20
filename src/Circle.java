import static java.lang.Math.*;

public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        ShapeCalculator shape = new ShapeCalculator();
        double res = shape.circleArea(this);
        return res;
    }

}
