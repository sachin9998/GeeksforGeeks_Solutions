//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        HashMap <Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < n; i++) {
            
            if ( !hm.containsKey(arr[i])) {
                hm.put(arr[i], 1);
            } 
            else {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
            
        }
        
        return hm.containsKey(x) ? hm.get(x) : 0;
        // hm.get(x);
    }
}