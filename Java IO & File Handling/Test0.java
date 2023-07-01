import java.io.File;
import java.io.IOException;

public class Test0 {
    public static void main(String[] args) {

        // Lab1 : Creating Empty File in Java

        File f = new File("G:\\java\\myTestFile.txt");
        // for creating file we will call createNewFile() Method

        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("file created successfully");
    }
}