package CollectionPractice2.Task2;

/**
 * Создать абстрактный класс Car, представляющий собой автомобиль.
 *
 * Добавить в него поля: марка, модель, год выпуска + несколько своих.
 * Создать 4 класса, являющихся наследниками Car.
 *
 * Переопределить во всех 3-х классах методы equals(), hashCode() и toString()
 * Создать класс Garage, хранящий в себе HashMap автомобилей, в котором ключом является объект автомобиля, значением - количество точно таких автомобилей в гараже.
 *
 * Добавить в класс Garage методы для парковки, выезда авто, а также для получения количества определенного вида автомобилей.
 *
 * Продемонстрировать работу гаража.
 */
public class DemoTask {
    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.park(new Truck(2020, Brand.BMV, Model.STATION_WAGON, Color.BLACK, 10));
        garage.park(new Truck(2020, Brand.MERCEDES, Model.STATION_WAGON, Color.BLUE, 15));
        garage.park(new RacingCar(2018, Brand.BMV, Model.SEDAN, Color.BLACK, 220));
        garage.park(new RacingCar(2018, Brand.BMV, Model.SEDAN, Color.BLACK, 220));
        System.out.println(garage.toString());
        System.out.println(garage.getCarCountMyBrand(Brand.BMV));

        garage.departure(new RacingCar(2018, Brand.BMV, Model.SEDAN, Color.BLACK, 220));
        System.out.println(garage.toString());
        System.out.println(garage.getCarCountByModel(Model.SEDAN));
    }
}
