package OopPracice3;

public class Asteroid extends SpaceObject { // астероид

    private int lenghtCircles;
    private final double PI = Math.PI;

    public Asteroid(int weight, int lenghtCircles) {
        super(weight);
        this.lenghtCircles = lenghtCircles;
    }

    @Override
    public int diameter() {
        return lenghtCircles * (int)PI;
    }

    @Override
    public boolean weightEquals(SpaceObject spaceObject) {
        return spaceObject.getWeight() == this.getWeight();
    }

    public int getLenghtCircles() {
        return lenghtCircles;
    }

    @Override
    public String toString() {
        return "Asteroid{" +
                "lenghtCircles=" + lenghtCircles +
                ", PI=" + PI +
                '}';
    }
}
