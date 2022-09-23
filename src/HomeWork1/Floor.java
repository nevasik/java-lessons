package HomeWork1;

public class Floor extends Home{
    int number; // номер этажа
    Flat[] flats; // множество квартир

    public Floor(int number, Flat[] flats) {
        this.number = number;
        this.flats = flats;
    }

    public int getNumber() {
        return number;
    }

    public Flat[] getFlats() {
        return flats;
    }

    @Override
    public void setNumber(int number) {
        this.number = number;
    }

    public void setFlats(Flat[] flats) {
        this.flats = flats;
    }

    @Override
    public void print(){
        System.out.println("Этаж: " + number + ", количество квартир: " + flats.length);
    }
}
