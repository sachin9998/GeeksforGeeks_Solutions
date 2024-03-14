//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    int K = Integer.parseInt(element[1]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		    int res = obj.lenOfLongSubarr(arr, sizeOfArray, K);
		    
		    System.out.println(res);
		}
	}
}



// } Driver Code Ends


//User function Template for Java

class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
         HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        int maxLength = 0;
        int prefixSum = 0;

        for (int i = 0; i < N; i++) {
            // Add the current element to the prefix sum
            prefixSum += A[i];

            // If prefix sum is equal to K, update maxLength
            if (prefixSum == K)
                maxLength = i + 1;

            // If prefix sum - K is present in the map, update maxLength
            if (prefixSumMap.containsKey(prefixSum - K))
                maxLength = Math.max(maxLength, i - prefixSumMap.get(prefixSum - K));

            // If prefix sum is not present in the map, add it with its index
            if (!prefixSumMap.containsKey(prefixSum))
                prefixSumMap.put(prefixSum, i);
        }

        return maxLength;
        
    }
    
    
}


