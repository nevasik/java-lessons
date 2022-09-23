package CollectionPractice2.Task2;

import java.util.Objects;

public abstract class Car {
    private final int year;
    private final Brand brand;
    private final Model model;
    private final Color color;

    public Car(int year, Brand brand, Model model, Color color) {
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Car car = (Car) obj;
        return year == car.year &&
               brand == car.brand &&
               model == car.model &&
               color == car.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, brand, model, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", brand=" + brand +
                ", model=" + model +
                ", color=" + color +
                '}';
    }

    public int getYear() {
        return year;
    }

    public Brand getBrand() {
        return brand;
    }

    public Model getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }
}
