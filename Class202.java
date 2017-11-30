package class202;
import java.util.*;

/**
 *
 * @author wschottl
 */
public class Class202 {
    
    public static void main(String[] args) {
        Linked ans = new Linked();
        ans.add("Midoriya");
        ans.add("Uraraka");
        ans.add("Iida");
        ans.add("Tsuyu");
        ans.display();
        ans.reverseList();       
        System.out.println("Midoriya is on the list: "+ans.contains("Midoriya"));
    }//main
    
}//class22

