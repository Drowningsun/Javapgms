package E1;

import java.io.*;
import java.util.*;

class Stdclass implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int Class;
	String division;
	int marks;
	public Stdclass(int Class,String division,int marks) {
		this.Class =Class;
		this.division =division;
		this.marks = marks;
	}
	
	public void details() {
		System.out.println("Class: "+Class+" Division: "+ division+" Marks: "+marks);
	}
	
}

public class FileDemo  {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter class: ");
		int Class = sc.nextInt();
		System.out.println("Enter division: ");
		String division = sc.next();
		System.out.println("Enter marks: ");
		int marks = sc.nextInt();
		
		Stdclass s = new Stdclass(Class,division,marks);
		try {
			FileOutputStream fos = new FileOutputStream("newfil.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s);
			fos.close();
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
		

	}

}
