package OopPracice3;

public class Comet extends SpaceObject{ // комета
    // D = (S/пи)^1/2, где S – площадь поверхности.

    private int square; // площадь поверхности
    private final double PI = Math.PI;
    private final double DEGREE = 0.5;

    public Comet(int weight, int square) {
        super(weight);
        this.square = square;
    }

    @Override
    public int diameter() {
        return (int) Math.pow(square, PI);
    }

    @Override
    public boolean weightEquals(SpaceObject spaceObject) {
        return spaceObject.getWeight() == this.getWeight();
    }


    public int getSquare() {
        return square;
    }

    @Override
    public String toString() {
        return "Comet{" +
                "square=" + square +
                ", PI=" + PI +
                ", DEGREE=" + DEGREE +
                '}';
    }
}
