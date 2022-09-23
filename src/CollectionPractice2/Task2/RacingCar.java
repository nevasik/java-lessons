package CollectionPractice2.Task2;

import java.util.Objects;

public class RacingCar extends Car {

    private final int maxSpeed;

    public RacingCar(int year, Brand brand, Model model, Color color, int maxSpeed) {
        super(year, brand, model, color);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        RacingCar racingCar = (RacingCar) obj;
        return maxSpeed == racingCar.maxSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxSpeed);
    }

    @Override
    public String toString() {
        return "RacingCar{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
