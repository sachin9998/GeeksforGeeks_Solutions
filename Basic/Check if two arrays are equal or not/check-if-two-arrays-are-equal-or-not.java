//{ Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;

import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		long t=sc.nextLong();
		
		while(t-->0)
		{
		  int n=sc.nextInt();
		  long arr[]=new long[n];
		  long brr[]=new long[n];
		  
		  for(int i=0;i<n;i++)
		  {
		      arr[i]=sc.nextLong();
		  }
		  
		  for(int i=0;i<n;i++)
		  {
		      brr[i]=sc.nextLong();
		  }
		  Solution ob = new Solution();
		  System.out.println(ob.check(arr,brr,n)==true?"1":"0");
		  
		  
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
                // Check if the sizes of the arrays are equal
        if (A.length != B.length) {
            return false;
        }

        Map<Long, Integer> countA = new HashMap<>();
        Map<Long, Integer> countB = new HashMap<>();

        // Count the occurrences of each element in array A
        for (long num : A) {
            countA.put(num, countA.getOrDefault(num, 0) + 1);
        }

        // Count the occurrences of each element in array B
        for (long num : B) {
            countB.put(num, countB.getOrDefault(num, 0) + 1);
        }

        // Compare the counts of elements in both arrays
        return countA.equals(countB);
    }
}