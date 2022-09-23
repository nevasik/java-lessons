package OopPractice2;

/**
 * Создать класс ShapeUtils со статическими методами:
 * 1. Определяющим, является ли фигура прямоугольником.
 * 2. Определяющим, является ли фигура треугольником.
 * 3. ...
 */

public class ShapeUtils {

    public static boolean isTriangle(Figures figures){
        return figures instanceof Triangle;
    }

    public static boolean isCircle(Figures figures){
        return figures instanceof Circle;
    }

    public static boolean isSquare(Figures figures){
        return figures instanceof Square;
    }

    public static boolean isRestangle(Figures figures){
        return figures instanceof Rectangle;
    }

    public static boolean isTrapeze(Figures figures){
        return figures instanceof Trapeze;
    }

    public static boolean isParallelogram(Figures figures){
        return figures instanceof Parallelogram;
    }

    public static boolean isRhombus(Figures figures){
        return figures instanceof Rhombus;
    }
}
