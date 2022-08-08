import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class EmployeePayroll{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID : ");
        String id = sc.next();
        System.out.print("Enter name : ");
        String name = sc.next();
        System.out.print("Enter Salary : ");
        String salary = sc.next();

       try{
        FileWriter fileWriter = new FileWriter("data.txt");
        fileWriter.write(id);
        fileWriter.write(name);
        fileWriter.write(salary);
        fileWriter.close();
       }
       catch(Exception e){
        System.out.println(e);
       }
}
}