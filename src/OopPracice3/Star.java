package OopPracice3;

public class Star extends SpaceObject{ // звезда
    // D = 2*(S/пи)^1/2, где S – площадь

    private int square; // площадь круга
    private final int VALUE = 2;
    private final double PI = Math.PI;
    private final double DEGREE = 0.5;

    public Star(int weight, int square) {
        super(weight);
        this.square = square;
    }

    @Override
    public int diameter() {
        int firstPart = VALUE * (square / (int)PI);
        return (int) Math.pow(firstPart, DEGREE);
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
        return "Star{" +
                "square=" + square +
                ", VALUE=" + VALUE +
                ", PI=" + PI +
                ", DEGREE=" + DEGREE +
                '}';
    }
}
