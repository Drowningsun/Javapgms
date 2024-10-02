package m2;
import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reverse = 0;

        for (int n = number; n != 0; n /= 10) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
        }

        System.out.println("Reversed number: " + reverse);
        scanner.close();
    }
}
