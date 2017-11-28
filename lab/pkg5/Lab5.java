/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5;

/**
 *
 * @author wschottl
 */
public class Lab5 {
    
    
    public static void knapSack(int maxWeight){
        int[] v = {30,25,20,40};//{10,40,30,50,20,70,80,90};
        int[] w ={3,4,2,5};//{5,4,6,3,2,7,1,3};
        
        int W = maxWeight;
        
        int[][] V = new int[v.length+1][W+1];
        int[][] keep = new int[v.length+1][W+1];
        
        for (int j = 0; j<= W; j++)
            V[0][j]=0;
        for (int i = 1; i <= v.length; i++) {
            for (int j = 0; j <= W; j++) {
                if((w[i-1]<= j)&&(v[i-1]+V[i-1][j-w[i-1]]>V[i-1][j])){
                    V[i][j] = v[i-1]+V[i-1][j-w[i-1]];
                    keep[i][j] = 1;
                }//if
                else{
                    V[i][j] = V[i-1][j];
                    keep[i][j] = 0;
                }//else    
            }//forj
        }//fori
        
        int K = W;
        
        System.out.println("Take Items: ");
        for (int i = v.length; i >= 1 ; i--) {
            if(keep[i][K] == 1){
                System.out.print(i-1+", ");
                K = K - w[i-1];
            }//if
        }//fori
         System.out.println("");
         System.out.println(" \nFor a total value of: "+V[v.length][W]+"\n");
    }//knapSack
    public static void main(String[] args) {
       Lab5 ans = new Lab5();
        Lab5.knapSack(30);
       
    }//main
    
}//class