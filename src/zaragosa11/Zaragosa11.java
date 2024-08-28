package zaragosa11;

import java.util.Scanner;
import java.text.NumberFormat;

public class Zaragosa11 {

   
    public static void main(String[] args) {
        Grades gr = new Grades();
       
       
     System.out.printf("%-10s %-10s %-10.2s 5-10.2s %-10.2s %-10.2s %10-2s 5-10s\n",
             "studentID", "name", "prelim", "midterm", "prefinal", "finalExam", "average", "remarks");  
        
       gr.addGrades(1001, "Mike",1.0, 1.0, 1.0, 1.0);
       gr.viewGrades();
       
       Grades grl = new Grades();
       grl.addGrades(1002, "John", 2.0, 1.0, 1.0, 1.0);
       grl.viewGrades();
        
    }
    
}
