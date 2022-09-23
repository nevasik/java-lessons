package OopPractice2;

public class Trapeze extends Figures implements Calculating, Comparison { // трапеция

    private int base1; // основание 1
    private int base2; // основание 2
    private int trapeziumHeight; // высота трепеции
    private final double TRAPEZOID_SIZE = 0.5;

    public Trapeze(int base1, int base2, int trapeziumHeight) {
        this.base1 = base1;
        this.base2 = base2;
        this.trapeziumHeight = trapeziumHeight;
    }

    @Override
    public double square() {
        double result = TRAPEZOID_SIZE * (base1 + base2) * trapeziumHeight;
        return (int)result;
    }

    @Override
    public boolean comparisonSquare(Figures figures) {
        return square() == figures.square();
    }

    public int getBase1() {
        return base1;
    }

    public int getBase2() {
        return base2;
    }

    public int getTrapeziumHeight() {
        return trapeziumHeight;
    }

    @Override
    public String toString() {
        return "Trapeze " +
                "base1 = " + base1 +
                ", base2 = " + base2 +
                ", trapeziumHeight = " + trapeziumHeight;
    }
}
