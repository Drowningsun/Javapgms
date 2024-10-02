package inhert_pack;
import java.util.*;

class Employee{
	
	protected String name;
	protected int empid;
	protected String department;
	
	void emp(String name,int empid,String department) {
		this.name = name;
		this.empid = empid;
		this.department = department;
	}
	
	void emp_details() {
		System.out.println("\t\tEMPLOYEE DETAILS");
		System.out.println("Name: "+name);
		System.out.println("Employee ID: "+empid);
		System.out.println("Department: "+department);
		System.out.println();
	}

}

class Manager extends Employee{
	
	protected String name;
	protected String department;
	
	void manager(String name,String department) {
		this.department = department;
		this.name = name;
	}
	
	void manager_details() {
		System.out.println("\t\tMANAGER DETAILS");
		System.out.println("Name: "+name);
		System.out.println("Department: "+department);
		System.out.println();
	}
}



public class Single_Inhert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Manager obj = new Manager();
		
		System.out.print("Enter Manager's name: ");
		String manager_name = sc.nextLine();
		System.out.print("Enter department: ");
		String mdepartment = sc.next();
		sc.nextLine();
		
		System.out.print("Enter Employee's name: ");
		String emp_name = sc.nextLine();
		System.out.print("Enter Employee ID: ");
		int emp_id = sc.nextInt();
		System.out.print("Enter department: ");
		String edepartment= sc.next();
		
		obj.emp(emp_name, emp_id, edepartment);
		obj.manager(manager_name, mdepartment);
		
		obj.emp_details();
		obj.manager_details();
		sc.close();
	}

}
