//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split("\\s+");
            int r = Integer.parseInt(str[0]);
            int c = Integer.parseInt(str[1]);
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                int k = 0;
                str = read.readLine().trim().split("\\s+");
                for(int j = 0; j < c; j++){
                  matrix[i][j] = Integer.parseInt(str[k]);
                  k++;
                }
            }
            new Solution().booleanMatrix(matrix);
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < r; i++){
                for(int j = 0; j < c; j++){
                    sb.append(matrix[i][j] + " ");
                }
                sb.append("\n"); 
            }
            System.out.print(sb);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int matrix[][])
    {
        // code here 
        
        int row = matrix.length;
        int col = matrix[0].length;
        
        int arr_row[] = new int[row];
        int arr_col[] = new int[col];
        
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(matrix[i][j] == 1) {
                    arr_row[i] = 1;
                    arr_col[j] = 1;
                }
            }
        }
        
        // For Printing 1 Rows
        
        for(int i = 0; i < row; i++) {
            
            if(arr_row[i] == 1) {
                
                for(int j = 0; j <col; j++) {
                    matrix[i][j] = 1;
                }
                
            }
            
        }
        
        // For Printing 1 Columns
        
        for(int i = 0; i < col; i++) {
            
            if(arr_col[i] == 1) {
                
                for(int j = 0; j <row; j++) {
                    matrix[j][i] = 1;
                }
                
            }
            
        }
        
        
    }
}