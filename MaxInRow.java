package m1;
import java.util.Scanner;
public class MaxInRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int row,col;
        System.out.println("Enter the number of rows in the matrix: ");
        row = sc.nextInt();
        System.out.println("Enter the number of columns in the matrix: ");
        col = sc.nextInt();
        int[][] mat= new int[row][col];
        
        System.out.println("Enter the elements of the matrix: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
        
        int max;
        System.out.println("Maximum elemts in each row: ");
        for(int i=0;i<row;i++){
            System.out.print("Row "+i+": ");
            max = mat[i][0];
            for(int j=0;j<col;j++){
                if(mat[i][j]>max){
                    max = mat[i][j];
                }
            }
            System.out.println(max);
        }
        sc.close();
	}
}
