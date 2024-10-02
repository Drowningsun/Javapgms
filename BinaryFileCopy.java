package pack1;
import java.io.*;

public class BinaryFileCopy {

    public static void main(String[] args) {
        String sourceFile = "sourceFile.bin";
        String destinationFile = "destinationFile.bin";

        try {
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destinationFile);

            int i;
            while ((i = fis.read()) != -1) {
                fos.write(i);
            }

            fis.close();
            fos.close();

            System.out.println("Binary file has been copied successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred during file operations.");
            e.printStackTrace();
        }
    }
}

