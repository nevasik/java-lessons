package OopPracice3;

public final class SpaceUtils {

    static int distanceFinal = SpaceObject.DISTANCE; // расстояние на которое удалены все тела
    static final double FORCE_VALUE = 6.67; // гравитационная постоянная величина
    SpaceObject space;

    private SpaceUtils(SpaceObject space) {
        this.space = space;
    }

    // определяем силу гравитации между объектами
    public static int gravityForce(SpaceObject spaceObject1, SpaceObject spaceObject2) {
        int result = (int)FORCE_VALUE * spaceObject1.getWeight() * spaceObject2.getWeight() * distanceFinal;
        return result;
    }

    public static boolean isAn(SpaceObject spaceObject){
        return spaceObject instanceof Star;
    }
}
