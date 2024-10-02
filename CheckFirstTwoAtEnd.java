package m4;
import java.util.Scanner;

public class CheckFirstTwoAtEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        if (str.length() < 2) {
            System.out.println("The string is too short to check.");
        } else {
            String firstTwo = str.substring(0, 2);
            String lastTwo = str.substring(str.length() - 2);
            
            if (firstTwo.equals(lastTwo)) {
                System.out.println("The first two characters appear at the end of the string.");
            } else {
                System.out.println("The first two characters do not appear at the end of the string.");
            }
        }
        
        sc.close();
    }
}
