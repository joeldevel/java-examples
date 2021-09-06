import java.io.*;

public class ReadTextFile {
  public static void main(String[] args) {
      FileReader fr = null;
      BufferedReader br = null;
      String textToRead = "MOCK_DATA.csv";

      try {
          fr = new FileReader(textToRead);
          br = new BufferedReader(fr);

          String line = br.readLine();
          while( line != null ) {
              System.out.println(line);
              line = br.readLine();
          }
       } catch( Exception e) {
           e.printStackTrace();
       } finally {
           try {
               fr.close();
           } catch (Exception e) {
               e.printStackTrace();
           }
       }
  }
}
