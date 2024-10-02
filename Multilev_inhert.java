package inhert_pack;
import java.util.Scanner;

class Vehicle {
    private String model;
    private int year;

    void setModel(String model) {
        this.model = model;
    }

    void setYear(int year) {
        this.year = year;
    }

    String getModel() {
        return model;
    }

    int getYear() {
        return year;
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}

class ElectricCar extends Car {
    private int batteryCapacity;

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }
}

public class Multilev_inhert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElectricCar myElectricCar = new ElectricCar();

        System.out.print("Enter the model: ");
        myElectricCar.setModel(sc.nextLine());

        System.out.print("Enter the year: ");
        myElectricCar.setYear(sc.nextInt());

        System.out.print("Enter the number of doors: ");
        myElectricCar.setNumberOfDoors(sc.nextInt());

        System.out.print("Enter the battery capacity: ");
        myElectricCar.setBatteryCapacity(sc.nextInt());

        System.out.println("Model: " + myElectricCar.getModel());
        System.out.println("Year: " + myElectricCar.getYear());
        System.out.println("Number of Doors: " + myElectricCar.getNumberOfDoors());
        System.out.println("Battery Capacity: " + myElectricCar.getBatteryCapacity() + " kWh");
        sc.close();
    }
}
