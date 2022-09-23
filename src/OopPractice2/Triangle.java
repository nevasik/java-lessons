package OopPractice2;

public class Triangle extends Figures implements Calculating, Comparison { // треугольник

    private final double TRIANGLE_SIZE = 0.5;
    private int baseLength; // длина основания
    private int height; // высота

    public Triangle(int baseLength, int height) {
        this.baseLength = baseLength;
        this.height = height;
    }

    @Override
    public double square() {
        double result = TRIANGLE_SIZE * (baseLength * height);
        return (int)result;
    }

    @Override
    public boolean comparisonSquare(Figures figures) {
        return square() == figures.square();
    }

    public double getTRIANGLE_SIZE() {
        return TRIANGLE_SIZE;
    }

    public int getBaseLength() {
        return baseLength;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Triangle " +
                " TRIANGLE_SIZE = " + TRIANGLE_SIZE +
                ", baseLength = " + baseLength +
                ", height = " + height;
    }
}
