package Alishev.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//                                        TYPE - туда входят Class, Enum
@Target(ElementType.METHOD) // ограничиваем нашу аннотацию только к методам и классам
@Retention(RetentionPolicy.RUNTIME) // чтобы аннотация была видна в ходе выполнения программы
public @interface MethodInfo {
    String author() default "Dima";
    int dateOfCreation() default 2022;
    String purpose();
}
