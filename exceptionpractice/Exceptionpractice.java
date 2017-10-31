package exceptionpractice;

/**
 *
 * @author wschottl
 */
public class Exceptionpractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            int a=5;
            System.out.println(a/1);
            
            if(a==5) throw new CusISay();
                
            
            
        }
        catch(ArithmeticException s){
            System.out.println("we are here");
            System.out.println("Message: "+s);
        }
        catch(Exception n){
            System.out.println("In Eception class here");
            System.out.println(n);
        }
        
        finally{
            System.out.println("At the bottom");
        }
        // TODO code application logic here
    }
    
}
