import java.io.FileWriter;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException{

        // Writing Data in File.

        FileWriter fw = new FileWriter("G:\\java\\avengers\\TestFile.txt",true);

        // .write() method to write data in the file.

        fw.write("I am The Earth\n");
        fw.write("I am The Forest Green\n");
        fw.write("I am The Four Winds Blowing\n");
        fw.write("I am The Earth\n");

        fw.flush();// flush clears the data in the buffer memory and writes into the file.
        fw.close();// closing the connection with file.
        System.out.println("File Prepared Successfully!");
    }

}
