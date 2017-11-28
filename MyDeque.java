package mydeque;

import java.util.LinkedList;

/**
 *
 * @author wschottl
 */
public class MyDeque<E>{
    public Node<E> back;
    public Node<E> front;
    
    public void insertBack(E e){  
        Node<E> N = new Node<>(e);
        if(back==null){
            front=back=N;
        } else{
            N.prev=back;
            back.next=N;
            back=N;
        }
    }//back
    public void insertFront(E e){
        Node<E> N = new Node<>(e);
        if(front==null){
            front=back=N;
        } else{
            N.next=front;
            front.prev=N;
            front=N;
        }
    }//front
    public E removeBack(){
        if(back==null) return null; //rempty Que
        if(front==back){
            Node<E> N = back;
            front=back=null;
            return N.element;
        }//if
        else{
            Node<E> N = back;
            N.prev.next=null;
            back=N.prev;
            return N.element;
        }//else
    }//back
    
    public E removeFront(){
        if(back==null) return null; //rempty Que
        if(front==back){
            Node<E> N = front;
            front=back=null;
            return N.element;
        }//if
        else{
            Node<E> N = front;
            N.next.prev=null;
            front=N.next;
            return N.element;
        }//else
    }//front
    
    public static void main(String[] args){
        MyDeque<Integer> dq = new MyDeque<>();
        System.out.println("Removing back value " + dq.removeBack());
        System.out.println("Removing front value " + dq.removeFront());
        dq.insertBack(23);
        dq.insertBack(34);
        System.out.println("Removing front value " + dq.removeFront());
        dq.insertBack(55);
        dq.insertFront(12);
        dq.insertFront(17);
        System.out.println("Removing front value " + dq.removeFront());
        System.out.println("Removing Back value " + dq.removeBack());
        System.out.println("Removing front value " + dq.removeFront());
        System.out.println("Removing Back value " + dq.removeBack());
        System.out.println("Removing Back value " + dq.removeBack());
        System.out.println("Removing front value " + dq.removeFront());
    }

}
class Node<E> {
    E element;
    Node<E> prev;
    Node<E> next;
    public Node(E e){ element = e;}
}

