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
public class Car extends Machine implements TaxInfo{
    
    String make; //like a Toyota
    String model; //like RAV4
    int miles;
    
    public Car(){ super();}
    
    public Car(String make, String model, int miles){
        super();
        this.make = make;
        this.model = model;
        this.miles = miles;
        
    }//with stuff
    
    @Override
    public void move(){
        System.out.println("This is a car . . . you drive it on a road!");
    }//move
    
    @Override
    public String toString(){
        String ans = super.toString()+"Car:"+"\nMake="+make+"\nModel="+model+"\nMiles="+miles+"\n"+"Value "+getValue()+"\n"+"Tax: "+calcTax()+" we have "+things+" things \n\n******************\n";
        return ans;
    }
    
    @Override
    public double calcTax(){
        return getValue()*BASIC_TAX;
        
    }//tax
    
}//class
