package m2;
import java.util.*;

public class FibanochiSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 0;
		int second = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter limit: ");
		int n = sc.nextInt();	
		
		System.out.print(first+" "+second+" ");
		
		int i = 0;
		while(i <n-2) {
			int next = first +second;
			first = second;
			second = next;
			System.out.print(second+" ");
			i++;
		}
		sc.close();
	}

}
