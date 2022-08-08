import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class EmployeePayroll1{
    public static void main(String[] args) {
      
       File file = new File("employeePayrollFile.txt");
       try{
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                String data = scan.nextLine();
                System.out.println(data);
            }
            scan.close();
       }
       catch(Exception e){
        System.out.println(e);
       }
}
}