
package parsing;

import java.io.*;
import java.util.*;

/**
 *
 * @author wschottl
 */
public class Parsing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File input = new File("data3.txt");
        //System.out.println(input);
        nameParsed(input);
        
    }//main
    
    public static void nameParsed(File s){
        try{
            Scanner input = new Scanner(s);
            String[] parse = new String[3];//why?
            FixSalary B = new FixSalary();
            String name="";
            double Salary=0;
            String letter="";
            while(input.hasNext()){//sentinel

                String line = input.nextLine();
                //System.out.println(line);
                parse=line.split(" ");
                letter = parse[0].substring(0,1);
                Salary=B.fixSalary(parse[2]);
                name=parse[1];
                System.out.println(name+","+letter+".\t"+Salary);
            }//while
        }//try
        catch(FileNotFoundException ex){
            System.out.println(ex);
            System.out.println("Error");
        }//catch
    }//readfile method
    
}//class
