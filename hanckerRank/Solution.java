package hanckerRank;

import java.io.IOException;
import utils.JUtil;
public class Solution {
	static int rank  =1;
	public static void main(String[] args) throws IOException {
		int[] scores = {100 ,100, 50, 40, 40, 20, 10};
		int[] alice = {5, 25, 50 ,120};
        JUtil.printIntArray("\nRanks", climbingLeaderboard(scores, alice));
    }
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
    	int []results = new int[alice.length];
    	int j = 0; 	int rank =1;
		for (int i = alice.length-1; i >=0; i--) {
			for (; j < scores.length; ) {
				if(j>0){
					if(scores[j] != scores[j-1]){
						rank++; //Tracking the Rank
					}
				}
				
				if(alice[i]>=scores[j]){
					results[i]=rank;
					break;
				}
				j++;
			}
			if(j>=scores.length-1){
				results[i]=rank;//if the rank is lowest, i.eout of scores array
			}
		}
        return results;//6421
    }
	private static void updateRank(int j,int[] scores, int[] alice) {
		
		
	}
    
    /*
static int[] climbingLeaderboard(int[] scores, int[] alice) {
    	int [] ranks = new int[alice.length];
    	
    	for (int i = 0; i < alice.length; i++) {
    		int count =1;
    		for (int j = 0; j < scores.length; j++) {
    			if(j>0){
    				if(scores[j] != scores[j-1])
    					count++; //Tracking the Rank
    			}
				if(alice[i]>=scores[j]){
					break;   //Found the rank
				}
				if(j==scores.length-1){
					count++;//if the rank is lowest, i.eout of scores array
				}
			}
    		ranks[i]=count;
		}
    	return ranks;//6421
    }
*/
    }




class Company {
	final Employee emp ;
	Company(){
		emp=new Employee();
	}
}

class Employee{}
