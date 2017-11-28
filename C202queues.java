package c202queues;
import java.util.*;

/**
 *
 * @author wschottl
 */
public class C202queues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        
        myQueue.enqueue("ED");
        myQueue.enqueue("Frank");
        myQueue.enumerate();
        
        LinkedList<String> q = new LinkedList<>();
        q.add("United");
        q.add("JAL");
        q.add("LAN");
        q.add("Delta");
        
        q.offer("Bob");
        q.offer("Ed");
        System.out.println("The List: ");
        System.out.println(q);
        System.out.println("");
        
        System.out.println("Front ="+q.element());
        q.poll();//removing the front element
        System.out.println("Front ="+q.peek());
        q.poll();//removing the front element
        System.out.println("Front ="+q.peek());
        q.poll();//removing the front element
        q.poll();//removing the front element
        q.poll();//This doesn't throw an exception
        q.remove(); //This can throw NoSuchElementException
        System.out.println(q);
        
    }//main
    
}//class
