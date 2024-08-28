package zaragosa11;

public class Grades {
    
    int studentID;
    String name;
    double prelim, midterm, prefinal , finalExam;
    double average;
    String remarks;
    
    public void addGrades(int StudentID, String name, double prelim, double midterm, double prefinal, double FinalExam ){
        
        this.studentID = StudentID;
        this.name = name;
        this.prelim = prelim;
        this.midterm = midterm;
        this.prefinal = prefinal;
        this.finalExam = finalExam;
        this.average = (prelim + midterm + prefinal + finalExam)/ 4;
        this.remarks = (average < 1.5) ? "Passed" : "Failed";
        
    }    
    
    
   public void viewGrades(){
       System.out.printf("%-10d %-10s %-10.2f 5-10.2f %-10.2f %-10.2f %10-2f 5-10s\n",
               this.studentID, this.name, this.prelim, this.midterm, this.prefinal, this.finalExam, this.average, remarks);
    }
    
   public static void  main (String[]args){
       
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
