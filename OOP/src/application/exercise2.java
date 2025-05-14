package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class exercise2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.printf("Employee: " + employee.toString());
        System.out.printf("Wicht percentage to increase salary? ");
        employee.increaseSalary(sc.nextDouble());
        System.out.printf("Updated data: " + employee.toString());

        sc.close();
    }
}
