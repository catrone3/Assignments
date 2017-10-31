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
public class Airplane extends Machine implements TaxInfo {
    
    private int horsePower;
    private int hours;
    
    public Airplane(int h, int hr){
        super();
        this.hours = hr;
        this.horsePower = h;
        
    }//boat
    
    @Override
    public void move(){
        System.out.println("This baby is a plane . . . it Flys through the air!");
    }//move
    
    @Override
    public String toString(){
        String ans = super.toString()+"Airplane"+"\nhorsePower="+horsePower+"\nHours="+hours+"\n"+"Value "+getValue()+"\n"+"Tax: "+calcTax()+" we have "+things+" things \n\n******************\n";
        return ans;
    }
    
    @Override
    public double calcTax(){
        return getValue()*LUXURY_TAX;
        
    }//tax
    
}//class
