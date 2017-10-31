package readfiles;
import java.io.*;
import java.util.*;

public class Readfiles{
    static double gpa;
    
    public void readData(){
        File inFile = new File("data1.txt");
        try{
            Scanner input = new Scanner(inFile);
            
            int count = 0;
            int sum = 0;
            String[] parts = new String[2];//array with 2 locations
            String line = input.nextLine();
            parts = line.split(" ");//split the line at the space
            
            for(int i = 0; !parts[i].equals("X"); i++){//sentinel
                System.out.println(line);
                parts = line.split(" ");
                count++;
                sum += Double.parseDouble(parts[1]);//convert to double
                line = input.nextLine();
            }//while
            if(count!=0)
               gpa=(double)sum/count;//cast
            System.out.println(count+"GPAs read");
            input.close();
            
        }//try
        catch(FileNotFoundException ex){
            System.out.println(ex);
            System.out.println("Error");
        }//catch
    }//readData method
    
    public static void main(String[] args){
        Readfiles ans = new Readfiles();
        ans.readData();
        System.out.printf("Class GPA: %6.2f\n", gpa);
    }//main
}//class