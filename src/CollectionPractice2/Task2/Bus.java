package CollectionPractice2.Task2;

import java.util.Objects;

public class Bus extends Car {

    private final int passengerAmount;

    public Bus(int year, Brand brand, Model model, Color color, int passengerAmount) {
        super(year, brand, model, color);
        this.passengerAmount = passengerAmount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        if (!super.equals(obj)) {
            return false;
        }
        Bus bus = (Bus) obj;
        return passengerAmount == bus.passengerAmount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengerAmount);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "passengerAmount=" + passengerAmount +
                '}';
    }

    public int getPassengerAmount() {
        return passengerAmount;
    }
}
