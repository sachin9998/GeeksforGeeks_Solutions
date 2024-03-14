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
    public static int lenOfLongSubarr (int a[], int N, int k) {
        HashMap<Integer, Integer> prefixSum = new HashMap<>();

        int currentSum = 0;
        int maxLength = 0; // For storing longest subarray length

        prefixSum.put(0, -1);

        for(int i = 0; i < a.length; i++) {
            currentSum += a[i];
            int diff = (int) currentSum - (int) k;
            
            if(prefixSum.containsKey(diff)) {
                int length = i - prefixSum.get(diff);

                if(length > maxLength) {
                    maxLength = length;
                }
            }

            // If map contains currentSum already then dont add to map.
            if (!prefixSum.containsKey(currentSum)) {
                prefixSum.put(currentSum, i);
            }
            

        }

        return maxLength;
    }
}


