package m1;
import java.util.*;
public class IdentityClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the identity matrix (n for an nxn matrix): ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					mat[i][j] = 1;
				}else {
					mat[i][j] = 0;
				}
			}
		}
		System.out.println("The identity matrix is: ");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(mat[i][j]+"\t");
			}
			System.out.print("\n");
		}
		
		sc.close();
	}
	
}
