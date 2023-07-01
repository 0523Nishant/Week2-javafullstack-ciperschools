import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Test0 {
    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("G:\\java\\myTestFile.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;

        // till the time value of line variable is not matching with null keep
        // running the loop

        ArrayList<String> pokemons = new ArrayList<String>();
        br.readLine();
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        fr.close();
    }
}