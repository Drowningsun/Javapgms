package tut11;
import evenpackage.Even;
import java.util.*;

public class Tutorial11EvenOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.print("Enter number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		System.out.println(Even.checkIfEven(num));
		sc.close();
	}

}
