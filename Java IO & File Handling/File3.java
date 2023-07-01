import java.io.File;
import java.nio.file.FileStore;

public class File3 {
    public static void main(String[] args) {

        // listing Files.

        File f = new File("G:\\java");

        String[] files = f.list();
        for (String file : files) {
            System.out.println(file);
        }
        File[] files_arr = f.listFiles();

        for (File ff : files_arr) {

        }
    }

}
