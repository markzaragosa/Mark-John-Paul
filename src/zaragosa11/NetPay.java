package zaragosa11;

import java.text.NumberFormat;
import java.util.Scanner;

public class NetPay {
    public String employeeName;
    public int employeeAge;
    public double hourlyRate;
    public double totalHoursWorked;
    public double totalDeductions;

    public void gatherDetails() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        employeeName = input.nextLine();

        System.out.print("Enter age: ");
        employeeAge = input.nextInt();

        System.out.print("Enter hourly rate: ");
        hourlyRate = input.nextDouble();

        System.out.print("Enter hours worked: ");
        totalHoursWorked = input.nextDouble();

        System.out.print("Enter total deductions: ");
        totalDeductions = input.nextDouble();

        input.close();
    }

    public void displaySlip() {
        System.out.println("------------------------");
        System.out.println("SLIP DETAILS");
        System.out.println("------------------------");

        System.out.println("DATE: AUGUST 14, 2024");
        System.out.println("Name: " + employeeName);
        System.out.println("Age: " + employeeAge);

        double grossPay = hourlyRate * totalHoursWorked;
        System.out.println("Total Gross Pay: " + grossPay);
        System.out.println("Total Deductions: " + totalDeductions);

        double netPay = grossPay - totalDeductions;
        System.out.println("-----------------------------------");
        System.out.println("Net Pay: " + netPay);
        System.out.println("-----------------------------------");

        double exampleAmount = 19500.0;
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String formattedAmount = formatter.format(exampleAmount);
        System.out.println("Formatted Example Amount: " + formattedAmount);
    }
}

