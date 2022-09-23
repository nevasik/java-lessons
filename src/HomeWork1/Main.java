package HomeWork1;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(true);
        Room room2 = new Room(false);
        Room room3= new Room(false);
        Room room4 = new Room(true);
        Room room5 = new Room(false);

        Flat flat1 = new Flat(100, new Room[]{room1, room2, room3, room4, room5});
        Flat flat2 = new Flat(99, new Room[]{room1});
        Flat flat3 = new Flat(98, new Room[]{room4, room5});
        Flat flat4 = new Flat(97, new Room[]{room1, room2, room3, room4});
        Flat flat5 = new Flat(96, new Room[]{room1, room3, room4});

        Floor floor1 = new Floor(13, new Flat[]{flat1, flat2, flat3, flat4, flat5});
        Floor floor2 = new Floor(13, new Flat[]{flat1, flat2, flat3, flat4, flat5});
        Floor floor3 = new Floor(13, new Flat[]{flat1, flat2, flat3, flat4, flat5});
        Floor floor4 = new Floor(13, new Flat[]{flat1, flat2, flat3, flat4, flat5});
        Floor floor5 = new Floor(12, new Flat[]{flat1, flat2, flat3, flat4, flat5});

        Home home1 = new Home(32, new Floor[]{floor1, floor2, floor3, floor4, floor5});
        Home home2 = new Home(32, new Floor[]{floor1, floor2, floor3, floor4, floor5});
        Home home3 = new Home(32, new Floor[]{floor1, floor2, floor3, floor4, floor5});
        Home home4 = new Home(32, new Floor[]{floor1, floor2, floor3, floor4, floor5});
        Home home5 = new Home(32, new Floor[]{floor1, floor2, floor3, floor4, floor5});

        home1.print();
        floor1.print();
        flat1.print();
        room1.print();
    }

    public static void printAllInformation(Home home){
        home.print();
    }
}
