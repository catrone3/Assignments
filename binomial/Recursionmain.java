/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binomial;

/**
 *
 * @author wschottl
 */
public class Recursionmain {
    
    public static void main(String[] args) {
        Binomial b = new Binomial();
        System.out.println(b.binomialRec(10,3));
        System.out.println(b.binomialDP(10, 3));
        
    }
    
}
