/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.io.*;
import java.util.*;

/**
 *
 * @author wschottl
 */
public class Assignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyLinkedList[] list = new MyLinkedList[26];
        for(int i = 0 ; i< list.length; i++){
            list[i] = new MyLinkedList<String>();
            int j=97;
            int countj=readDictionary((char)j,list[i]);
            j++;
            System.out.println(countj);
            System.out.println(list[i]);
        }
        
        
    }
    
    
    public static int readDictionary(char b, MyLinkedList c){
        File inFile = new File("dictionary.txt");
        int count=0;
        try{
            Scanner input = new Scanner(inFile);
            while(input.hasNext()){
                String currentline = input.nextLine();
                currentline=currentline.toLowerCase();
                if(currentline.charAt(0)==b){
                    c.add(currentline);
                    count++;
                }//while
            }//while
        }//try
        catch(FileNotFoundException ex){
            System.out.println(ex);
            System.out.println("Error");
        }//catch
        return count;
    }//readData method
    
}
