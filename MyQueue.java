package c202queues;
import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author wschottl
 */
public class MyQueue {
    LinkedList<String> queue;
    
    public MyQueue(){
        queue = new LinkedList<String>();
    }
    
    public void enqueue(String data){
        queue.addLast(data);
    }
    
    public String dequeue(){
        return (queue.removeFirst());
    }
    
    public int size(){
        return queue.size();
    }
    
    public boolean isEmpty(){
        return (queue.size()==0);
    }
    
    public String peek(){
        return queue.peekFirst();
    }
    public void enumerate(){
        System.out.println("Enumerate");
        ListIterator<String> iterator = queue.listIterator(0);
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }//while
    }//enumerate
}//class
