package inputOutputStreams;

import java.io.File;
import java.io.IOException;
public class FileRunner {
    /**
     *      output stream
     *  application ---------> file
     *
     *      input stream
     *  application <--------- file
     */
    public static void main(String[] args) throws IOException {
        File file = new File("resources/test.txt");
        System.out.println(file.createNewFile());
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getAbsolutePath());

        File dir = new File("resources/test/dir");
        System.out.println(dir.mkdirs());
        dir.list();

    }
}
