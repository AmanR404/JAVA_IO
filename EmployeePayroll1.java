import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class EmployeePayroll1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID : ");
        String id = sc.next();
        System.out.print("Enter name : ");
        String name = sc.next();
        System.out.print("Enter Salary : ");
        String salary = sc.next();

       try{
        FileWriter fileWriter = new FileWriter("employeePayrollFile.txt");
        fileWriter.write("Employee Payroll data --> ");
        fileWriter.write("ID : " + id);
        fileWriter.write(" Name : " + name);
        fileWriter.write(" Salary : " + salary);
        fileWriter.close();
       }
       catch(Exception e){
        System.out.println(e);
       }
}
}
