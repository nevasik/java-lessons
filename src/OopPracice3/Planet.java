package OopPracice3;

public class Planet extends SpaceObject { // планета

    private int radius;
    private final int TO_VALUE = 2;

    public Planet(int weight, int radius) {
        super(weight);
        this.radius = radius;
    }

    @Override
    public int diameter() {
        return radius * TO_VALUE;
    }

    @Override
    public boolean weightEquals(SpaceObject spaceObject) {
        return spaceObject.getWeight() == this.getWeight();
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "radius=" + radius +
                ", TO_VALUE=" + TO_VALUE +
                '}';
    }
}


