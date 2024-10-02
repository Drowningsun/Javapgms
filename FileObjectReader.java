package E1;
import java.io.*;

public class FileObjectReader{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("newfil.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Stdclass p = (Stdclass)ois.readObject();
			p.details();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
