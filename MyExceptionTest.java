package tut9;
import java.util.*;

class MyException extends Exception{
	private String message;
	MyException(String message){
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
}

public class MyExceptionTest {
public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
System. out. print("Enter num1:");
int num1 = sc.nextInt();
System.out.print("Enter num2:");
int num2 = sc.nextInt();
System.out.println("num1="+num1);
System.out.println("num2="+num2) ;
try {
System.out .println("sum="+add(num1, num2) );
}
catch(MyException e) {
System.out.print(e.getMessage());}
System.out.println("\nout of block");
}

public static int add(int a, int b) throws MyException{

if (a<=0) {

throw new MyException("a should be positive");
}
if (b<=0) {
throw new MyException("b should be positive");
}
return a+b;
}
}