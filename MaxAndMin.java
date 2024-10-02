package m3;
import java.util.Scanner;
public class MaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int max = array[0];
        int min = array[0];
        
        for(int i=0;i<n;i++) {
        	if(array[i] <= min) {
        		min = array[i];
        	}
        	if(array[i] >= max) {
        		max = array[i];
        	}
        }
        System.out.print("Max: "+max+"\nMin: "+min);
        sc.close();
	}

}
