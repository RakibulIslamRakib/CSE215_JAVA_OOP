import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;
public class Employee {
  Scanner sc=new Scanner(System.in);
  String name, phoneNumber, address,designation; int jobId, salary;
    public void information() throws InvalidSalary {
      System.out.println("Enter How many Employee Information?");
        int numberOfEmployee=sc.nextInt();
        String[] informationArray= new String [numberOfEmployee];
        for(int i=0;i<numberOfEmployee;i++){
            System.out.println("Enter "+(i+1)+"st employee details?");
            System.out.print("Name:");
            name=sc.next();
            System.out.print("Id:");
            jobId=sc.nextInt();
            System.out.print("Salary:");
            salary=sc.nextInt();
            if(salary<0){
              throw new InvalidSalary("Invalid Salary..");
            }
            System.out.print("phone:");
            phoneNumber=sc.next();
            System.out.print("Address:");
            address=sc.next();
            System.out.print("Designation:");
            designation=sc.next();
            System.out.println();
            informationArray[i]=name+" "+jobId+" "+salary+" "+phoneNumber+" "+address+" "+designation;
        }
        try {
            File employeeInformation = new File("employeeInformation.txt");
            PrintStream writer = new PrintStream(employeeInformation);
           
            for(int i=0;i<numberOfEmployee;i++){
                writer.print(informationArray[i]+"\n");
            }
            writer.close();
            System.out.println("Successfully wrote to the file.");
          } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
  }
  