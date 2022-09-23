package OopPracice3;

public class Satellite extends SpaceObject { // спутник

    private int lenghtCircles; // длина окружности
    private final double PI = Math.PI;

    public Satellite(int weight, int lenghtCircles) {
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
        return "Satellite{" +
                "lenghtCircles=" + lenghtCircles +
                ", PI=" + PI +
                '}';
    }
}
