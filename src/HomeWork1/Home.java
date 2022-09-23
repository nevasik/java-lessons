package HomeWork1;


public class Home {
     int number; // номер дома
     Floor [] floors; // множество этажей

    public Home() {
    }

    public Home(int number, Floor [] floors) {
        this.number = number;
        this.floors = floors;
    }

    public int getNumber() {
        return number;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setFloors(Floor[] floors) {
        this.floors = floors;
    }

    public void print() {
        System.out.println("Дом: " + number + ", количество этажей: " + floors.length);
    }
}
