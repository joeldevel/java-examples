import java.io.*;

public class ReadNumbersFromTextFile {
    public static void main(String[] args) {

        FileReader fr = null;
        BufferedReader br = null;
        String line;

        try {
            fr = new FileReader("integers.txt");
            br = new BufferedReader(fr);
            line = br.readLine();
            while( line != null ) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch ( Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch ( Exception e) {
                e.printStackTrace();
            }
        }
    }
}
