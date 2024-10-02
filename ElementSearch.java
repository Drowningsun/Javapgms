package m3;
import java.util.Scanner;

public class ElementSearch {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns in the matrix: ");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the element to search for: ");
        int elementToSearch = sc.nextInt();
        boolean isFound = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == elementToSearch) {
                    System.out.println("Element " + elementToSearch + " found at position: (" + i + ", " + j + ")");
                    isFound = true;
                }
            }
        }
        if (!isFound) {
            System.out.println("Element " + elementToSearch + " not found in the matrix.");
        }

        sc.close();
    }
}

