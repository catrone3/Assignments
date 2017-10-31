package exceptionpractice;

/**
 *
 * @author wschottl
 */
public class CusISay extends Exception{
    CusISay(String m){
        System.out.println("In Cuz!! Message is " + m);
    }
    CusISay(){
        System.out.println("No Args . . . here");
    }
    
}
