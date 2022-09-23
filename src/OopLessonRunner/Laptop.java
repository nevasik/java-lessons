package OopLessonRunner;

public class Laptop extends Computer {

    private int weight;

    public Laptop(Ssd ssd, Ram ram, int weight) {
        super(ssd, ram);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void load() {
        open();
        System.out.println("Я загрузился");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Weight " + weight);
    }

    public void open(){
        System.out.println("Открыл крышку");
    }
}
