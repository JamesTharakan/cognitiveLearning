package puzzles;


/*

Dynamic Programming

It's just a fancy name for saying that when you are breaking the problem down into subproblems,
you'll store their values. Next time, if you encounter the same subproblem, 
you'll just reuse the stored value instead of recalculating.

If you use recursion to break down your problem, it's called top down approach (memoization) and 
if you use iterative approach, its called bottoms up approach.

In recursion, you start with the whole problem and then start breaking it down into smaller pieces. 

Whereas in iterative approach, you start with the smallest problem (base case), 
keep storing values and work your way up to the real problem at hand.
 
Many a times, iterative way is a tidy bit computationally more efficient in terms of time 
than recursive approach but iterative approach does consume more space.

*/

//https://www.youtube.com/watch?v=43P0xZp3FU4
//https://www.youtube.com/watch?v=ASoaQq66foQ
//How to find the actual string also . Is it possible in recursive approach ?


//This is recursive approach
public class LongestCommonSubsequence {

	static String result="";
	public static void main(String[] args) {
		
//		String s1 = "aggtab"; String s2 = "gxtxayb";	//gtab
		String s1 = "ABCDGH"; String s2 = "AEDFHR";	//ADH
		int count  =  lcs(s1,s2);
		
		System.out.println("Count : " +count);
		System.out.println(result);

	}
	
	
	public static int lcs(String s1 , String s2) {
		
		int s1l =s1.length();
		int s2l =s2.length();
		
		if(s1l == 0 || s2l ==0)
			return 0;
		
		if(s1.charAt(s1l-1) == s2.charAt(s2l-1)) {
			result = result+s1.charAt(s1l-1);
			return 1 + lcs(s1.substring(0, s1l-1), s2.substring(0, s2l-1));
		}else
			return 	Math.max(lcs(s1, s2.substring(0, s2l-1)) ,lcs(s1.substring(0, s1l-1), s2));
		
	}

}


