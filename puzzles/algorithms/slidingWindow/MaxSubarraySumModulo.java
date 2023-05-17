package puzzles.algorithms.slidingWindow;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 * https://www.hackerrank.com/challenges/maximum-subarray-sum/problem
 * @author jtharakan
 *
 */
public class MaxSubarraySumModulo {

	public static void main(String[] args) {
		

		
		
	}



	public static long maximumSum(List<Long> a, long m) {

		long n = 1;// sum of n numbers

		long currentWindowSize = 0;
		long sum = 0;
		int j = 0;
		long max =0;
		
		while(n <= a.size()) {
			for (int i = 0; i < a.size(); i++) {
				sum += a.get(i);
				currentWindowSize++;
			System.out.print("Size :"+currentWindowSize+" n :"+n);
				if (currentWindowSize == n) {
					long temp =sum % m;
					System.out.print(" Max :"+max+ " temp:"+temp);
					max = (temp)>max ? temp :max ;
					sum = sum - a.get(j);
					System.out.print(" sum :"+sum);
					j++;currentWindowSize--;
				} 
				System.out.println(" Fmax :"+max);
			}
			n++;
			sum=0;j=0;
		
		}
		
		return max;
	

	    }	
}
/*
1
50 1804289384
846930887 1681692778 1714636916 1957747794 424238336 719885387 1649760493 596516650 1189641422 1025202363 
1350490028 783368691 1102520060 2044897764 1967513927 1365180541 1540383427 304089173 1303455737 35005212 
521595369 294702568 1726956430 336465783 861021531 278722863 233665124 2145174068 468703136 1101513930 
1801979803 1315634023 635723059 1369133070 1125898168 1059961394 2089018457 628175012 1656478043 1131176230 
1653377374 859484422 1914544920 608413785 756898538 1734575199 1973594325 149798316 2038664371 1129566414
*/

/*
long n = 1;// sum of n numbers

long size = 0;
long sum = 0;
int j = 0;
long max =0;
long mod =7;

long input[] = {3,3,9,9,5};

while(n <= input.length) {
	for (int i = 0; i < input.length; i++) {
		sum += input[i];
		size++;
	System.out.print("Size :"+size+" n :"+n);
		if (size == n) {
			long temp =sum % mod;
			System.out.print(" Max :"+max+ " temp:"+temp);
			max = (temp)>max ? temp :max ;
			sum = sum - input[j];
			System.out.print(" sum :"+sum);
			j++;size--;
		} 
		System.out.println(" Fmax :"+max);
	}
	n++;
	sum=0;j=0;

}

System.out.println(max);

*/