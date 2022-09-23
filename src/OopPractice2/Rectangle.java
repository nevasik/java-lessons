package OopPractice2;

public class Rectangle extends Figures implements Calculating, Comparison, CalculatingDiagonal { // прямоугольник

    private int lenght; // длина
    private int weight; // ширина

    public Rectangle(int lenght, int weight) {
        this.lenght = lenght;
        this.weight = weight;
    }

    @Override
    public double square() {
        double result = lenght * weight;
        return result;
    }

    @Override
    public boolean comparisonSquare(Figures figures) {
        //boolean equals = figures.result == this.result;
        return square() == figures.square();
    }

    @Override
    public double diagonal() {
        return Math.pow(lenght, 2) + Math.pow(weight, 2);
    }

    public int getLenght() {
        return lenght;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Rectangle " +
                "lenght = " + lenght +
                ", weight = " + weight;
    }
}
