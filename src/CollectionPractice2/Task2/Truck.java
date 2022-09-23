package CollectionPractice2.Task2;

import java.util.Objects;

public class Truck extends Car {

    private final double liftingCapacity;

    public Truck(int year, Brand brand, Model model, Color color, double liftingCapacity) {
        super(year, brand, model, color);
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Truck truck = (Truck) obj;
        return Double.compare(truck.liftingCapacity, liftingCapacity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), liftingCapacity == 0);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "liftingCapacity=" + liftingCapacity +
                '}';
    }

    public double getLiftingCapacity() {
        return liftingCapacity;
    }
}
