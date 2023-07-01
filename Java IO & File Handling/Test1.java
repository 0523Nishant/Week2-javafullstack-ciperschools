import java.io.File;

public class Test1 {

    // Checking id=fFile Exists and Fetching File Details
    public static void main(String[] args) {

        File f = new File("G:\\java\\myTestFile.txt");
        // using exists() to check if file exists or not

        if (f.exists()) {
            System.out.println("Printing File Details");
            System.out.println("-----------------------");

            System.out.println("File Name : " + f.getName());
            System.out.println("File Size : " + f.length());
            System.out.println("File Path " + f.getAbsolutePath());
            System.out.println("Is File Readable ? " + f.canRead());
            System.out.println("Is File Writable ? " + f.canWrite());

            System.out.println("-----------------------");
        }

        // Creating Directory in Java

        File f1 = new File("G:\\java\\avengers");
        f1.mkdir();
    }

}
