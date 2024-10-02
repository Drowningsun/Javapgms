package m2;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int i=1;
		int fact =1;
		while(i<=n) {
			fact = fact * i;
			i++;
		}
		System.out.println("Factorial of "+n+": "+fact);
		sc.close();
	}

}
