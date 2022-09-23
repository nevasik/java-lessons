package OopPractice2;

public class Square extends Figures implements Calculating, Comparison { // квадрат

    private int side; // сторона

    public Square(double result, int side) {
        super(result);
        this.side = side;
    }

    @Override
    public double square() {
        double result = Math.pow(side, 2);
        return (int)result;
    }

    @Override
    public boolean comparisonSquare(Figures figures) {
        boolean result;
        return square() == figures.square();
    }

    public int getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "Square " +
                "side = " + side;
    }
}
