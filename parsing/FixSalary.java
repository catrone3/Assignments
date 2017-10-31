
package parsing;

/**
 *
 * @author wschottl
 */
public class FixSalary {
    
    public double fixSalary(String s){
        int start = s.indexOf('$')+1;
        //System.out.println(start);
        int pull = s.indexOf(',');
        String salary = s.substring(start,pull);
        String end = s.substring(pull+1);
        salary = salary+end;
        //System.out.println(salary);
        double finish = Double.parseDouble(salary);
        return finish;
        
    }
    
}//class
