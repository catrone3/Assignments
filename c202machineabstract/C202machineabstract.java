/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c202machineabstract;

/**
 *
 * @author wschottl
 */
public class C202machineabstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Machine c1 = new Car("Ford", "Windstar", 100000);
        c1.move();
        c1.setValue(500);
        c1.setColor("Red");
        System.out.println(c1.toString());
        System.out.println("");
        c1.move();
        
        Boat b1 = new Boat(350, 2000);
        b1.move();
        b1.setValue(20000);
        b1.setLocation("Lake");
        System.out.println(b1);
        System.out.println("");
        b1.move();
        System.out.println(b1);
        
        Airplane a1 = new Airplane(700, 8000);
        a1.move();
        a1.setValue(600000);
        a1.setLocation("Lake");
        System.out.println(a1);
        System.out.println("");
        
        Machine[] arrayOfStuff = new Machine[10];
        
        for (int i = 0; i<arrayOfStuff.length; i++){
            if(i%2 ==0){
                arrayOfStuff[i] = new Boat(i*10, i*100);
            }
            else{
                arrayOfStuff[i]= new Car();
            } 
        }      
    }  
}
