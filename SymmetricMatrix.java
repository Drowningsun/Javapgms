package m1;
import java.util.*;

public class SymmetricMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the square matrix (n for an n x n matrix): ");
		int n = sc.nextInt();
		
		System.out.println("Enter the elements of the matrix: ");
		
		int[][] mat= new int[n][n];
		for(int i=0; i<n;i++) {
			for(int j=0;j<n;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("The matrix is: ");
		
		for(int i=0; i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(mat[i][j]+"\t");
			}
			System.out.print("\n");
		}
		
		boolean isSymmetric = true;
		for(int i=0; i<n;i++) {
			for(int j=0;j<n;j++) {
				if(mat[i][j] != mat[j][i]) {
					isSymmetric = false;
					break;
				}
			}
		}
		
		System.out.println(isSymmetric?"The matrix is symmetric.":"The matrix is not symmetric.");
		sc.close();
	}

}
