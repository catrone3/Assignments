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
public class Binomial {

    public int binomialRec(int n, int k){
        System.out.println("Binomial Rec("+n+","+k+")");
        if((k==0)||(k==n))
            return 1;
        else
            return binomialRec(n-1,k-1)+binomialRec(n-1,k);
    }
    
    public int binomialDP(int n, int k){
        System.out.println("Binomial DP("+n+","+k+")");
        int[][] c = new int[n+1][k+1];
        //calc from bottom up
        for(int i=0;i<=n;i++){
            System.out.println("in for loop at"+i);
            for(int j=0;j<=Math.min(i,k);j++){
                //base
                if(j==0||j==i)
                    c[i][j]=1;
                else
                    c[i][j]=c[i-1][j-1]+c[i-1][j];
            }//for j
        }//for i
        return c[n][k];
    }//dp
    
}//class
