package m4;
import java.util.*;
public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		//str = str.toUpperCase();
		String str1 = "";
		boolean flag = false;
		
		for(int i =0; i< str.length();i++) {
			int c = 1;
			for(int j=0;j<str.length();j++) {
				if(!(j==i) && (str.charAt(i)==str.charAt(j))&&!(str1.contains(str.substring(j,j+1)))) {
					c++;
					flag = true;
					
				}
			}
			if((c >= 2)/* && !(str1.contains(str.substring(i,i+1)))*/
					) {
				System.out.println("frequency of '"+str.charAt(i)+"'= "+c);
			}
			str1 = str1 + str.substring(i,i+1);
		}
		if(!flag) {
			System.out.print("no duplicate charecters.");
		}
		sc.close();
	}

}
