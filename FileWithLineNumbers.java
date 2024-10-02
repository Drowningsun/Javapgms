package pack1;

import java.io.*;

public class FileWithLineNumbers {

    public static void main(String[] args) {
        String fileName = "input.txt";

        try {
            FileReader re = new FileReader(fileName);
            BufferedReader br = new BufferedReader(re);

            String line;
            int lineNumber = 1;
            while ((line = br.readLine()) != null) {
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }

            br.close();
            re.close();

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}
