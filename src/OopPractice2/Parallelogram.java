package OopPractice2;

public class Parallelogram extends Figures implements Calculating, Comparison { // параллелограмм

    private int paralSide; // сторона параллелограмма
    private int paralHeight; // высота параллелограмма

    public Parallelogram(int paralSide, int paralHeight) {
        this.paralSide = paralSide;
        this.paralHeight = paralHeight;
    }

    @Override
    public double square() {
        double result = paralHeight * paralSide;
        return (int)result;
    }

    @Override
    public boolean comparisonSquare(Figures figures) {
        return square() == figures.square();
    }

    public int getParalSide() {
        return paralSide;
    }

    public int getParalHeight() {
        return paralHeight;
    }

    @Override
    public String toString() {
        return "Parallelogram " +
                "paralSide = " + paralSide +
                ", paralHeight = " + paralHeight;
    }
}
