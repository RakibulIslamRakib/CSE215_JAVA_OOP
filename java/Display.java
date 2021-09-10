import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class Display implements Salary {

    @Override
    public void allData() {
        File file =new File("employeeInformation.txt");
        Scanner sc;
        String s;
          try {
              sc = new Scanner(file);
              System.out.println("Name      Id      Salary      Phone      Address       Designation");
              while (sc.hasNextLine()){
              s= sc.nextLine();
              System.out.println(s);
              }
          }catch (FileNotFoundException e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
          }
        
    }

    @Override
    public void lowest() {
        File file =new File("lowest.txt");
        Scanner sc;
        String s;
          try {
              sc = new Scanner(file);
              System.out.println("Name      Id      Salary      Phone      Address       Designation");
              while (sc.hasNextLine()){
              s= sc.nextLine();
              System.out.println(s);
              }
          }catch (FileNotFoundException e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
          }
        
    }

    @Override
    public void highest() {
        File file =new File("highest.txt");
        Scanner sc;
        String s;
          try {
              sc = new Scanner(file);
              System.out.println("Name      Id      Salary      Phone      Address       Designation");
              while (sc.hasNextLine()){
              s= sc.nextLine();
              System.out.println(s);
              }
          }catch (FileNotFoundException e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
          }
        
    }

    @Override
    public void average() {
        File file1 =new File("highest.txt");
        File file2 =new File("lowest.txt");
        Scanner sc1,sc2;
        String[] s1,s2;
          try {
              sc1 = new Scanner(file1);
              s1= sc1.nextLine().split(" ");
              sc2 = new Scanner(file2);
              s2= sc2.nextLine().split(" ");
              int cur1=Integer.parseInt(s1[2]);
              int cur2=Integer.parseInt(s2[2]);
              int average = (cur1+cur2)/2;
              System.out.println("Average: "+average +" All");

          }catch (FileNotFoundException e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
          }
        
    }
    
}
