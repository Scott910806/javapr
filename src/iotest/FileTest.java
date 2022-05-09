package src.iotest;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File(".");
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsoluteFile().getParent());

        File tempFile = File.createTempFile("scott", ".txt", file);
        tempFile.deleteOnExit();

        File newFile = new File(System.currentTimeMillis() + "");
        System.out.println(newFile.exists());
        newFile.createNewFile();
        newFile.mkdir();
    }
}
