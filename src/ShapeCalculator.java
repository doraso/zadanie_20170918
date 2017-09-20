import static java.lang.Math.*;

public class ShapeCalculator {

    double squareArea(Square square){
        return pow(square.a, 2);
    }

    double circleArea(Circle circle){
        return circle.radius*Math.PI;
    }

    double trianglePerimeter(Triangle triangle){
        return triangle.a + triangle.b + triangle.c;
    }

    double rectPerimeter(Rectangle rectangle){
        return (2 * rectangle.a) + (2 * rectangle.b);

    }
}
