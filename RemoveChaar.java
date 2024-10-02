package m4;

import java.util.*;

public class RemoveChaar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = new String(sc.nextLine());
		String str1 = new String("");
		
		System.out.print("Enter the charecter to be removed: ");
		char ch = sc.next().charAt(0);
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=ch){
				str1 = str1 + str.substring(i, i+1);
			}
		}
		System.out.print(str1);
		sc.close();
		
	}
}
