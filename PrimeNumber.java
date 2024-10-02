package m2;

public class PrimeNumber {
	public static void main(String [] args) {
		
		System.out.print("Prime numbers b/t 1 and 100: ");
		
		for(int i=2;i<=100;i++) {
			int flag=1;
			for(int j =2;j<=i/2;j++) {
				if(i%j==0) {
					flag = 0;
				}
			}
			
			if(flag == 1) {
				System.out.print(i+" ");
			}
		}
		
	}
}
