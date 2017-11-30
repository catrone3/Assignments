/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author wschottl
 */
public class Readfile {
    
    public void readData(String n){
        File inFile = new File(n);
        try{
            Scanner input = new Scanner(inFile);
            
            int count = 0;
            int sum = 0;
            String[] parts = new String[2];//array with 2 locations
            String line = input.nextLine();
            parts = line.split(" ");//split the line at the space
            
            for(int i = 0; !parts[i].equals("X"); i++){//sentinel
                System.out.println(line);
                parts = line.split(" ");
                count++;
                sum += Double.parseDouble(parts[1]);//convert to double
                line = input.nextLine();
            }//while
            
        }//try
        catch(FileNotFoundException ex){
            System.out.println(ex);
            System.out.println("Error");
        }//catch
    }//readData method
    
}
