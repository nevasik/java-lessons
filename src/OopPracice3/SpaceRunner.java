package OopPracice3;

public class SpaceRunner {
    public static void main(String[] args) {

        Planet planet = new Planet(5_000, 10_632);
        Satellite satellite = new Satellite(2_300, 56_000);
        Star star = new Star(600, 5_000);
        Asteroid asteroid = new Asteroid(4_000, 20_000);
        Comet comet = new Comet(4_000, 2_500);

        System.out.println("Радиус планеты: " + planet.diameter());
        System.out.println("Радиус спутника: " + satellite.diameter());
        System.out.println("Радиус звезды: " + star.diameter());
        System.out.println("Радиус астероида: " + asteroid.diameter());
        System.out.println("Радиус кометы: " + comet.diameter());

        System.out.println(planet.weightEquals(satellite));
        System.out.println(asteroid.weightEquals(comet));

        System.out.println(SpaceUtils.gravityForce(planet, comet));
        System.out.println(SpaceUtils.gravityForce(satellite, asteroid));

        System.out.println(SpaceUtils.isAn(star));
        System.out.println(SpaceUtils.isAn(comet));
        System.out.println(SpaceUtils.isAn(asteroid));

    }
}
