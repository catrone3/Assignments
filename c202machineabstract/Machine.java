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
public abstract class Machine implements TaxInfo{
    
    private String color;
    private String location;
    private double value;
    private boolean loan;
    
    static int things = 0;
    
    //contstructor w defaults
    public Machine(){
        things++;
        color = "none";
        location = "Not placed yet";
        value = 0;
        loan = false;
        
    }//default constructors
    
    public Machine(String color, String location, double value){
        things++;
        loan = false;
        this.color = color;
        this.location = location;
        this.value = value;
        
    }//Main machine code
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String Color){
        this.color = Color;
    }
    public String getLocation(){
       return location;
    }
    
    public void setLocation(String Location){
        this.location = Location;
    }
    
    public double getValue(){
        return value;
    }
    
    public void setValue(double Value){
        this.value= Value;
    }
    
    public boolean isLoan(){
        return loan;
    }
    
    public void setLoan(boolean Loan){
        this.loan = Loan;
    }
    
    public abstract void move();
    
    @Override
    public String toString(){
        String ans = "Machine" + "\ncolor=" + color + "\nlocation=" + location +"\nvalue=" + value + "\nIs there a loan?" + loan +"\n";
        return ans;
    }//to String
            
}//class
