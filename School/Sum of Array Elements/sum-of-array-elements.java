//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            String str[] = read.readLine().trim().split(" ");
            
            int input[] = new int[n];
            for(int i = 0; i < n; i++)
            {
                input[i] = Integer.parseInt(str[i]);
            }
            
            //int x = Integer.parseInt(read.readLine());
            Get obj = new Get();
            System.out.println(obj.sumElement(input, n));
            
        }
    }
} 



// } Driver Code Ends


//User function Template for Java


class Get
{
    public static int sumElement(int arr[], int n)
    {
        // Your code here
        
        if(n == 0) {
            return 0;
        }
        
        return arr[ n - 1] + sumElement(arr, n - 1);
        
    }
}
