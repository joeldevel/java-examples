import java.io.*;

public class AddNumbersReadFromTextFile {
    public static void main(String[] args) {

        FileReader fr = null;
        BufferedReader br = null;
        String line;
        int sum = 0;

        try {
            fr = new FileReader("integers.txt");
            br = new BufferedReader(fr);

            line = br.readLine();
            while( line != null ) {
                try {
                    sum += Integer.parseInt(line);
                    System.out.println(line);
                } catch ( Exception e){
                    e.printStackTrace();
                    System.err.println("There is some bad input");
                } finally {
                    line = br.readLine();
                }
            }
        } catch ( Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("sum is: " + sum);
            try {
                fr.close();
            } catch ( Exception e) {
                e.printStackTrace();
            }
        }
    }
}
