package Alishev.ReflectionApi;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE}) // аннотация, что бы использовалась в методам и классах
@Retention(RetentionPolicy.RUNTIME) // что бы анннотация была видна в ходе выполнения программы
public @interface Author {
    String name();
    int dateOfCreation();
}
