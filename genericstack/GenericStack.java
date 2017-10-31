package genericstack;

/**
 *
 * @author wschottl
 */
public class GenericStack<E> {

    /**
     * @param args the command line arguments
     */
    
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();
    
    public int getSize(){
        return list.size();
    }
    
    public E peek(){
        return list.get(getSize() - 1);
    }
    
    public void push(E o){
        list.add(o);
    }
    
    public E pop(){
        E o = list.get(getSize()-1);
        list.remove(getSize()-1);
        return o;
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    @Override
    public String toString(){
        return "stack: " + list.toString();
    }
    
    public <E extends Comparable<E>> E max(E o1, E o2){
        if(o1.compareTo(o2)>0)
            return o1;
        else
            return o2;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        GenericStack<Integer> ans = new GenericStack<>();
        ans.push(4);
        ans.push(8);
        System.out.println(ans.getSize());
        System.out.println(ans.list);
        System.out.println(ans.peek());
    }
}
