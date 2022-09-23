package OopPractice2;

public class Circle extends Figures implements Calculating, Comparison { // круг

    private int radius; // радиус
    private final double PI = Math.PI;
    Figures figures;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        double result = radius * PI;
        return (int)result;
    }

    @Override
    public boolean comparisonSquare(Figures figures) {
        return square() == figures.square();
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle " +
                "radius = " + radius +
                ", PI = " + PI;
    }
}
