import java.util.Scanner;
public class EmployeePayroll{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID : ");
        int id = sc.nextInt();
        System.out.print("Enter name : ");
        String name = sc.next();
        System.out.print("Enter Salary : ");
        int salary = sc.nextInt();

        System.out.println(" ");
        System.out.println("Employee Info --> \n"+ "ID : "+ id + " Name : "+ name + " Salary : "+salary);

    }
}