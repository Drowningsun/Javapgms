package inhert_pack;
import java.util.Scanner;

class Employee1 {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class FullTimeEmployee extends Employee1 {
    private double annualSalary;

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }
}

class PartTimeEmployee extends Employee1 {
    private double hourlyRate;

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
}

public class Hirar_inhert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        System.out.print("Enter the name of the full-time employee: ");
        fullTimeEmployee.setName(sc.nextLine());
        System.out.print("Enter the annual salary: ");
        fullTimeEmployee.setAnnualSalary(sc.nextDouble());

        System.out.println("\nFull-Time Employee Details:");
        System.out.println("Name: " + fullTimeEmployee.getName());
        System.out.println("Annual Salary: $" + fullTimeEmployee.getAnnualSalary());

        sc.nextLine(); 

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
        System.out.print("\nEnter the name of the part-time employee: ");
        partTimeEmployee.setName(sc.nextLine());
        System.out.print("Enter the hourly rate: ");
        partTimeEmployee.setHourlyRate(sc.nextDouble());

        System.out.println("\nPart-Time Employee Details:");
        System.out.println("Name: " + partTimeEmployee.getName());
        System.out.println("Hourly Rate: $" + partTimeEmployee.getHourlyRate());
        sc.close();
    }
}
