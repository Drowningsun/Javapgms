package pack1;

import java.io.*;

public class LineCounter {

    public static void main(String[] args) {
        String fileName = "input.txt";
        int lineCount = 0;

        try {
            FileReader re = new FileReader(fileName);
            BufferedReader br = new BufferedReader(re);
            
            String line;
            while ((line = br.readLine()) != null) {
            	System.out.println(line);
                lineCount++;
            }

            br.close();
            re.close();

            System.out.println("Number of lines: " + lineCount);

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}
