
package lab4;

import java.io.*;
import java.util.*;

/**
 *
 * @author wschottl
 */
public class Lab4 {

    
    public static int bestcost=10000000;
    public static int CITI = 12;
    public static int[][] adjacency = new int[CITI][CITI];
    
    public static void main(String[] args) {
        // TODO code application logic here
        Lab4 ans = new Lab4();
        ArrayList<Integer> incomplete = new ArrayList<>();
        incomplete.add(0);
        ArrayList<Integer> remaining = new ArrayList<>();
        for(int i=1; i<CITI;i++){
            remaining.add(i);
        }
        ans.populateMatrix();
        ans.show();
        ans.recDFS(incomplete, remaining);
        
    }//main
    public void show(){
        for (int i = 0; i < adjacency.length; i++) {
            for (int j = 0; j < adjacency.length; j++) {
                System.out.print(adjacency[i][j]+"\t");
                
            }//i
            System.out.println("");
            
        }//j
        System.out.println("");
    }//show
    
    
    public static ArrayList<Integer> utility(int ints){
        ArrayList<Integer> intList = new ArrayList<Integer>();
        for (int i = 0; i < ints; i++){
            intList.add(ints);
        }//for
        return intList;
    }//method
    public void populateMatrix(){
        try{
            File data = new File("tsp12.txt");
            Scanner input = new Scanner(data);
            int value, i, j;
            for(i=0;i<CITI && input.hasNext(); i++){
                for(j=i;j<CITI &&input.hasNext(); j++){
                    if(i==j){
                        adjacency[i][j]=0;
                    }//if
                    else{
                        value = input.nextInt();
                        System.out.print(value+" : ");
                        adjacency[i][j]=value;
                        adjacency[j][i]=value;
                    }//else
                }//for j
                System.out.println("");
            }//for i
            
            
        }//try
        catch(Exception ex){
            System.out.println("error");
        }//catch
    }//populate matrix method
    
    public static void recDFS(ArrayList<Integer> pT, ArrayList<Integer> remainingCities){
        if(remainingCities.isEmpty()){
            int partial = computeCost(pT);
            if(partial<bestcost){
                bestcost=partial;
                System.out.println(pT + " costs: "+bestcost);
            }//if
        }//if
        else{
            for(int i=0; i<remainingCities.size(); i++){
                ArrayList<Integer> newpartialTour = new ArrayList<>(pT);
                newpartialTour.add(remainingCities.get(i));
                int pcost = computeCost(newpartialTour);
                if(pcost<bestcost){
                    ArrayList<Integer> newremainingCities = new ArrayList<>(remainingCities);
                    newremainingCities.remove(i);
                    recDFS(newpartialTour, newremainingCities);
                }//if
            }//for
        }//else
    }//method
    
    
    public static int computeCost(ArrayList<Integer> tour){
        int cost=0;
        for(int i=0;i<tour.size()-1; i++){
            cost += adjacency[tour.get(i)][tour.get(i+1)];
        }//for i
        if(tour.size()==CITI){
            cost+= adjacency[tour.get(tour.size()-1)][0];
        }
        return cost;
    }//method
    
    
}//class
