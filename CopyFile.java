package pack1;
import java.io.*;

public class CopyFile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		try {
			File f1 = new File("File1.txt");
			File f2 = new File("File2.txt");
			
			
			if(f1.exists() && f2.exists()) {
				System.out.println("file 1 exists");
				FileInputStream fis = new FileInputStream("File1.txt");
				System.out.println("file 2 exists");
				FileOutputStream fos = new FileOutputStream("File2.txt");
				
				int i;
				while((i= fis.read()) != -1) {
					fos.write(i);
				}
				fos.close();
				fis.close();
				
				FileInputStream fis1 = new FileInputStream("File1.txt");
				FileInputStream fis2 = new FileInputStream("File2.txt");
				
				System.out.println("File content copied from file1 to file2.");
				
				System.out.println("**file contents of file 1**");
				while((i = fis1.read()) != -1) {
					System.out.print((char)i);
				}
				
				System.out.println("\n**file contents of file 2**");
				while((i = fis2.read()) != -1) {
					System.out.print((char)i);
				}
				fis1.close();
				fis.close();
				
			}else {
				if(!f1.exists()) {
					System.out.println("File1 does not exist.");
				}
				if(!f2.exists()) {
					System.out.println("File2 does not exist.");
				}
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
