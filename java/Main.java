
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) throws InvalidSalary{        
      Scanner sc=new Scanner(System.in);
          Employee e=new Employee();
          e.information();


          File file =new File("employeeInformation.txt");
          ArrayList<String> employeeData = new ArrayList<String>();
          String s;
            try {
                sc = new Scanner(file);
                while (sc.hasNextLine()){
                s= sc.nextLine();
                employeeData.add(s);
                }
            }catch (FileNotFoundException ex) {
                // TODO Auto-generated catch block
                ex.printStackTrace();
            }




          LowestSalary ls = new LowestSalary();
          ls.LSalary(employeeData);
          //EmployeeData emdata = new EmployeeData();
          //emdata.data();

          Display display = new Display();
          System.out.println("Lowest Salary:\n");
          display.lowest();
          System.out.println("Highest Salary::\n");
          display.highest();
          display.average();
          System.out.println("Employee:\n\n\n");
          display.allData();
    }

}
