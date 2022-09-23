package OopPracice3;

public abstract class SpaceObject  {

    private int weight;
    public static int DISTANCE = 10;

    public SpaceObject(int weight) {
        this.weight = weight;
    }

    public SpaceObject(int weight, int DISTANCE){
        this.weight = weight;
        this.DISTANCE = DISTANCE;
    }

    public abstract int diameter();

    public abstract boolean weightEquals(SpaceObject spaceObject);

    public int getWeight() {
        return weight;
    }
}
