package pack1;
import java.io.*;

public class FileWriteExample {
    public static void main(String[] args) {
        try {
            
            FileWriter writer = new FileWriter("MyFile.txt");

            writer.write("This is the University Exam for OODP.\n");
            writer.write("This is a program to illustrate the use of files.\n");

            writer.close();
            System.out.println("File has been written successfully.");
            
            FileReader re = new FileReader("MyFile.txt");
            BufferedReader br = new BufferedReader(re);
            
            String line;
            while((line = br.readLine()) != null) {
            	System.out.println(line);
            }
            
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
    }
}
