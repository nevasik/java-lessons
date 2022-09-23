package OopPractice2;

public class Test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 10);
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(10, 6);
        Trapeze trapeze = new Trapeze(7, 8, 2);
        Parallelogram parallelogram = new Parallelogram(3, 9);
        Rhombus rhombus = new Rhombus(7, 7);

        System.out.println("Площадь треугольника: " + triangle.square());
        System.out.println("Площадь круга: " + circle.square());
        System.out.println("Площадь прямоугольника: " + rectangle.square());
        System.out.println("Площадь трапеции: " + trapeze.square());
        System.out.println("Площадь параллелограмма: " + parallelogram.square());
        System.out.println("Площадь ромба: " + rhombus.square());

        System.out.println(circle.comparisonSquare(trapeze));
        System.out.println(trapeze.comparisonSquare(triangle));
        System.out.println(parallelogram.comparisonSquare(rhombus));
        System.out.println(rectangle.comparisonSquare(circle));

        System.out.println(rectangle.diagonal());
    }
}
