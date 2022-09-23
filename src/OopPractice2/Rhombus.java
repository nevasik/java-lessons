package OopPractice2;

public class Rhombus extends Figures implements Calculating, Comparison, CalculatingDiamondSide {

    private final double RHOMBIC_VALUE = 0.5;
    private int diagonal1; // диагональ 1
    private int diagonal2; // диагональ 2

    public Rhombus(int diagonal1, int diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public double square() {
        double result = RHOMBIC_VALUE * (diagonal1 * diagonal2);
        return (int)result;
    }

    @Override
    public boolean comparisonSquare(Figures figures) {
        return square() == figures.square();
    }

    @Override
    public double sideRhombus() {
        double result = Math.sqrt(Math.pow(diagonal1, 2) + Math.pow(diagonal2, 2));
        return result / 2;
    }

    public int getDiagonal1() {
        return diagonal1;
    }

    public int getDiagonal2() {
        return diagonal2;
    }

    @Override
    public String toString() {
        return "Rhombus " +
                "diagonal1 = " + diagonal1 +
                ", diagonal2 = " + diagonal2;
    }
}
