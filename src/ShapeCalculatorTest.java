public class ShapeCalculatorTest {
    public static void main(String[] args) {

        //ShapeCalculator shape1 = new ShapeCalculator();
        Square square1 = new Square(3);
        Rectangle rectangle1 = new Rectangle(5, 3);
        Circle circle1 = new Circle(7);
        Triangle triangle1 = new Triangle(1, 2, 3);

        double result1 = square1.calculateArea();
        System.out.println("Utworzono kwadrat" + ", " + "którego pole wynosi: " + result1);

        double result2 = circle1.calculateArea();
        System.out.println("Utworzono koło" + ", " + "którego pole wynosi: " + result2);


        double result3 = rectangle1.calculatePerimeter();
        System.out.println("Utworzono prostokąt" + ", " + "którego obwód wynosi: " + result3);

        double result4 = triangle1.calculatePerimeter();
        System.out.println("Utworzono trójkąt" + ", " + "którego obwód wynosi: " + result4);


        /*do zadania 2.1

        double result1 = shape1.squareArea(square1);
        System.out.println("Utworzono kwadrat" + ", " + "którego pole wynosi: " + result1);

        double result2 = shape1.circleArea(circle1);
        System.out.println("Utworzono koło" + ", " + "którego pole wynosi: " + result2);

        double result3 = shape1.rectPerimeter(rectangle1);
        System.out.println("Utworzono prostokąt" + ", " + "którego obwód wynosi: " + result3);

        double result4 = shape1.trianglePerimeter(triangle1);
        System.out.println("Utworzono trójkąt" + ", " + "którego obwód wynosi: " + result4);
        */

    }
}
