package OopPractice2;

public abstract class Figures extends ShapeUtils implements Calculating {

    double result;

    public Figures(double result) {
        this.result = result;
    }

    public Figures() {
    }

}
