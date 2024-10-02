package m1;
import java.util.*;

public class ScalarMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int cols,rows;
		System.out.println("Enter the number of rows in the 2D matrix:: ");
		rows = sc.nextInt();
		
		System.out.println("Enter the number of columns in the 2D matrix: ");
		cols = sc.nextInt();
		
		int [][] mat = new int[rows][cols];
		
		System.out.println("Enter the elements: ");
		
		for(int i=0; i<rows;i++) {
			for(int j=0; j<cols;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("The matrix is: ");
		
		for(int i=0; i<rows;i++) {
			for(int j=0; j<cols;j++) {
				System.out.print(mat[i][j]+"\t");
			}
			System.out.print("\n");
		}
		System.out.println("Enter the scalar value to multiply with the matrix: ");
		int scalar = sc.nextInt();
		System.out.println("The resulting matrix after scalar multiplication is: ");
		
		for(int i=0; i<rows;i++) {
			for(int j=0; j<cols;j++) {
				System.out.print(mat[i][j]*scalar+"\t");
			}
			System.out.print("\n");
		}
		sc.close();
		
	}

}
