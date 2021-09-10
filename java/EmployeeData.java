import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

abstract class EmployeeData {

    EmployeeData(){
        data();
    }
   
    ArrayList<String> employeeData;

    public void data() {
      File file =new File("employeeInformation.txt");
      Scanner sc;
      ArrayList<String> employeeData = new ArrayList<String>();
      String s;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()){
            s= sc.nextLine();
            employeeData.add(s);
            HighestSalary hs = new HighestSalary();
            hs.hSalary(employeeData);
            }
        }catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    abstract void LSalary(ArrayList<String> employeeData);
}    
