package Alishev.ReflectionApi;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class TestReflection {

    public static void main(String[] args) throws Exception {
//        Person person = new Person();

//        Class personClass = Person.class; // 1 способ, что бы получить доступ к нашему Class class
//        Class personClass2 = personClass.getClass(); // 2 способ
//        Class personClass3 = Class.forName("package.Alishev.ReflectionApi.Person"); // 3 способ, указать путь до класса

//        Method[] method = personClass.getMethods();
//        for (Method methods : method) {
//            System.out.println(methods.getName() + ", "
//                    + methods.getReturnType() + ", " + Arrays.toString(methods.getParameterTypes()));
//        }

//        Field[] fields = personClass.getDeclaredFields();
//        for (Field field : fields) {
//            System.out.println(field.getName() + ", " // что бы посмотреть приватные поля нашего класса
//                    + field.getType());
//        }

        // теперь попробуем получит все аннотации нашего класса Person
       // Annotation[] annotations = personClass.getAnnotations();

//        for (Annotation annotation : annotations) {
//            if (annotation instanceof  Author) { // что бы проверить, является ли аннотация 'Author' аннотацией класса Person
//                System.out.println("Yes");
//            }
//        }

        Scanner scanner = new Scanner(System.in);
        // Название_класса1 Название_класса2 Название_метода

        Class classObject1 = Class.forName(scanner.next()); // здесь будет содержаться объект класса(который мы передали в параметры, то есть Класс, который мы зададим в консоль), и этот объект будет храниться в переменной
        Class classObject2 = Class.forName(scanner.next()); // здесь тоже самое, что и выше
        String methodName = scanner.next(); // название метода, который мы передадим в консоли

        Method m = classObject1.getMethod(methodName, classObject2); // аргумент methodName будет класс classObject2, поэтому мы его и передали вторым агументом(т.е. что стоит в методе аргументом)
        Object o1 = classObject1.newInstance();
        Object o2 = classObject2.getConstructor(String.class).newInstance("String value");

        m.invoke(o1, o2);

        System.out.println(o1);


    }
}
