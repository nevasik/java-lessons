package SerializationAndDeserialization;

import java.io.*;
import java.nio.file.Path;
public class SerializationDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Path path = Path.of("resources", "student.out");
        writeObject(path);
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path.toFile()))) {
            Object object = objectInputStream.readObject();
            System.out.println(object);
        }
    }

    public static void writeObject(Path path) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
            Person sergey = new Person(26, "Sergey");
            outputStream.writeObject(sergey);
        }
    }
}
