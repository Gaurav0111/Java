package OOPS;

import java.util.Scanner;

class Employee {

    private int id;
    private String name;
    private double salary;

    Employee() { // used to initialize instance variable of class
        id = 101;
        name = "";
        salary = 5000;
    }

    Employee(int id, String name, double salary) {
        this();
        this.id = id;
    }

    public void input(int id, String name, double salary) {
        if (id <= 0 || salary <= 0) {
            System.out.println("Invalid data");
            return;
        }
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void printing() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee ram;
        ram = new Employee();
        System.out.println("Enter the Id: ");
        int id = scanner.nextInt();
        System.out.println("Enter the name: ");
        String name = scanner.next();
        System.out.println("Enter the Salary: ");
        double salary = scanner.nextDouble();

        ram.printing();
        ram.input(id, name, salary);
        ram.printing();
        scanner.close();
        // System.out.println(ram.id);
        // System.out.println(ram.name);
        // System.out.println(ram.salary);
        // System.out.println();

        // ram.id = 101;
        // ram.name = "Gaurav";
        // ram.salary = 352321;

        // System.out.println(ram.id);
        // System.out.println(ram.name);
        // System.out.println(ram.salary);

    }
}
