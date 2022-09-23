package HomeWork1;

public class Flat extends Home {
    int number; // номер квартиры
    Room [] room; // множество комнат

    public Flat(int number, Room [] room) {
        this.number = number;
        this.room = room;
    }

    @Override
    public void print(){
        System.out.println("Квартира: " + number + ", количество комнат: " + room.length);
    }
}
