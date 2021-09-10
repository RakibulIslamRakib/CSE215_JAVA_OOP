
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.ListIterator;

public class LowestSalary extends EmployeeData{

    LowestSalary(){
        super();
    }

    
    // public void lSalary(ArrayList<String> employeeData){
    //     ListIterator<String> List_Iterator= employeeData.listIterator(employeeData.size());
    //     int lowestSalary  = Integer.MAX_VALUE;
    //     String lowestData ="",s_cur;
    //     String[] s;
    //     while (List_Iterator.hasPrevious()) {
    //         s_cur = List_Iterator.previous();
    //         s = s_cur.split(" ");
    //         int cur=Integer.parseInt(s[2]);
    //         if(cur < lowestSalary ){
    //         lowestSalary =cur;
    //         lowestData = s_cur;
    //         }
    //     }
    //         File employeeInformation = new File("lowest.txt");
    //         PrintStream writer;
    //         try {
    //             writer = new PrintStream(employeeInformation);
    //             writer.print(lowestData);
    //             writer.close();
    //             System.out.println("Successfully wrote to the file.");
    //         } catch (FileNotFoundException e) {
    //             // TODO Auto-generated catch block
    //             e.printStackTrace();
    //         }
            
    // }

    @Override
    void LSalary(ArrayList<String> employeeData) {
        ListIterator<String> List_Iterator= employeeData.listIterator(employeeData.size());
        int lowestSalary  = Integer.MAX_VALUE;
        String lowestData ="",s_cur;
        String[] s;
        while (List_Iterator.hasPrevious()) {
            s_cur = List_Iterator.previous();
            s = s_cur.split(" ");
            int cur=Integer.parseInt(s[2]);
            if(cur < lowestSalary ){
            lowestSalary =cur;
            lowestData = s_cur;
            }
        }
            File employeeInformation = new File("lowest.txt");
            PrintStream writer;
            try {
                writer = new PrintStream(employeeInformation);
                
                writer.print(lowestData);
                writer.close();
                System.out.println("Successfully wrote to the file.");
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        
    }
    
}
