package m4;
import java.util.Scanner;

public class ModifyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        if (str.length() < 2) {
            System.out.println("The string is too short to modify.");
        } else {
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            
            if (first == last) {
                String modifiedStr = str.substring(1, str.length() - 1);
                System.out.println("Modified string: " + modifiedStr);
            } else {
                System.out.println("Original string: " + str);
            }
        }
        
        sc.close();
    }
}
