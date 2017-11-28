package lab8;

/* wschottl */


/* Implements a FIFO-Priority Queue using two LIFO Stacks.
 * offer: add an element to this queue, return true if element is added successfully, return false otherwise
 * priorityPoll: removes and returns the element with the highest priority.
 * elementPoll:  removes and returns the element at the front of the queue.
 * peek: returns the element at the front of the queue.              
 */

import java.util.*;

public class BinaryPollQueue<E extends Comparable<E>> { // Do not change this line
    
    /* Two LIFO Stacks to act as the container of this BinaryPollQueue. DO NOT CHANGE!!! */
    private Stack<E> stk1;
    private Stack<E> stk2;
    
    public BinaryPollQueue(){
        stk1 = new Stack();
        stk2 = new Stack();
    }//constructor

    
    public boolean offer(E e){
        stk1.push(e);
        return true;
    }//offer
    
    public E elementPoll(){
        while(!stk1.isEmpty()){
            stk2.push(stk1.pop());
        }//while
        E old = stk2.pop();
        while(!stk2.isEmpty()){
            stk1.push(stk2.pop());
        }//while
        return old;
    }//element poll
    
    public E peek(){
        while(!stk1.isEmpty()){
            stk2.push(stk1.pop());
        }//while
        E old = stk2.peek();
        while(!stk2.isEmpty()){
            stk1.push(stk2.pop());
        }//while
        return old;
    }//elementpeek
    
    
    public E priorityPoll(){
        E maxPriority = stk1.peek();// sets initial value
        while(!stk1.isEmpty()){
            if(stk1.peek().compareTo(maxPriority) >= 0){
                maxPriority = stk1.peek();
            }//if
            stk2.push(stk1.pop());
        }//while
        while(!stk2.isEmpty()){
            if(maxPriority.equals(stk2.peek())){
                maxPriority = stk2.pop();   
            }//if
            stk1.push(stk2.pop());
        }//while
        return maxPriority;
    }//Priority Poll

}


