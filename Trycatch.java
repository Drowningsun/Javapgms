package E1;
import java.util.*;

public class Trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 =  sc.nextInt();
		try {
			System.out.println("number is num "+(10/num1));
			System.out.println("Exicuted sucessfully");
			sc.close();
		}catch(ArithmeticException e) {
			System.out.println("Division by zero not possible");
			System.out.println(e.getMessage());
		}
		System.out.println("code ends here!!");

	}

}
