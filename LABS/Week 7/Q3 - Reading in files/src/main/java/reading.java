import edu.princeton.cs.introcs.*;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;


public class reading {

    public static void main(String[] args) throws IOException {
        In file = new In("http://www.gutenberg.org/files/39063/39063-0.txt");
        while (!file.isEmpty()) {
            String line = file.readLine();
            if (line.contains("mountain")) {
                System.out.println(line);
            }
        }

        try {
            FileReader file2 = new FileReader("texttest.txt");
            BufferedReader bufferedReader = new BufferedReader(file2);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            file2.close();

        } catch (IOException error){
            error.printStackTrace();
        }

    }
}
