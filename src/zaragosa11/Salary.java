package zaragosa05;

import java.util.Scanner;
public class Salary{
    
    class Employee{
    
        int id;
        String name;
        double rate;
        double hoursWorked;
        double grossPay;
        double deduction;
        double NetPay;
        Employee (int id, String name, double rate, double hoursWorked, double deduction){
        
            this.id = id;
            this.name = name;
            this.hoursWorked = hoursWorked;
            this.grossPay = rate * hoursWorked;
            this.deduction = deduction;
            this.NetPay = grossPay - deduction;
            
   } 
 }
  
  public void Salaries(){
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter the number of employee: ");
      int emp = input.nextInt();
      
      Employee[]employees = new Employee[emp];
      
      for (int i = 0; i <emp; i++){
          
          System.out.print("Details of Employee" + (i + i) + ":");
          
          System.out.print("ID: ");
          int id = input.nextInt();
          
          System.out.print("Name");
          String name = input.next();
          
          
          System.out.print("Rate: ");
          double rate = input.nextDouble();
          
          System.out.print("Hours worked: ");
          double hrs = input.nextDouble();
          
          System.out.print("Total deductions");
          double deduc = input.nextDouble();
          
          employees[i] = new Employee (id, name, rate, hrs, deduc);
          
          
}
      
      System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n"
              ,"ID", "Name", "Rate", "Hours", "Gross", "deduction", "Net Pay");
                
  
      for (Employee e : employees){
        System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f\n",
                e.id, e.name, e.rate, e.hoursWorked, e.grossPay, e.deduction, e.NetPay);
      
        
        
        
    }
  }      
}

