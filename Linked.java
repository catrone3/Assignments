
package class202;

import java.util.*;

/**
 *
 * @author wschottl
 */
public class Linked {
    
    private int size = 0;
    private Node head;
    private Node temp;
    private Node tail;
    Stack <Object> s1 = new Stack<>();
    
    private class Node <T>{
        T element;
        Node <T> next;
        public Node(T e){
            element = e;
        }//constructor
    }//node
        
    public Linked(){
        head = new Node(null);
        tail = new Node(null);
        size = 0;
    }//class22
    
    public <T> void add(T e){
        if(size == 0){
            head = new Node<>(e);
            System.out.println("First Element Loaded.");
            size ++;
        }//if
        else{
            Node temp = new Node(e);
            Node current = head;
            while(current.next != null){
                current = current.next; //move down the list
            }//while
            current.next = temp;
            size++;
        }//else
    }//add
    
    public <T> void display(){
        temp = new Node(null);
        temp = head; //start at the begining
        System.out.print("[ ");
        while(temp.next != null){
            System.out.print(temp.element+", ");
            temp = temp.next;// moving down the list
        }//while
        System.out.println(temp.element+" ]");//get the last item of the list
    }//display
    
    public <T> void reverseList(){
        System.out.println("Reversed list");
        temp = head;
        while(temp != null){
            s1.push(temp.element);
           temp = temp.next;
        }//while
        while(!s1.empty()){
            System.out.print(s1.pop()+", ");
        }//while
        System.out.println("");
    }//reverse list
    
    public <E> boolean contains(E o){
        boolean ans = false;
        //search the list
        temp = new Node(null);
        temp = head;
        while(temp.next != null){
            if(temp.element.equals(o)) return true;
            temp = temp.next;
        }//while
        return ans;
    }//contains
    
}
