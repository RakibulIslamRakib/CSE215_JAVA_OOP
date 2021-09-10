import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.ListIterator;

public class HighestSalary {
    public void hSalary(ArrayList<String> employeeData){
        ListIterator<String> List_Iterator= employeeData.listIterator(employeeData.size());
        int highestSalary = 0;
        String highestData="",s_cur;
        String[] s;
        while (List_Iterator.hasPrevious()) {
            s_cur = List_Iterator.previous();
            s = s_cur.split(" ");
            int cur=Integer.parseInt(s[2]);
            if(cur > highestSalary){
            highestSalary=cur;
            highestData = s_cur;
            }
        }
            File employeeInformation = new File("highest.txt");
            PrintStream writer;
            try {
                writer = new PrintStream(employeeInformation);
                writer.print(highestData);
                writer.close();
                System.out.println("Successfully wrote to the file.");
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
    }
}
