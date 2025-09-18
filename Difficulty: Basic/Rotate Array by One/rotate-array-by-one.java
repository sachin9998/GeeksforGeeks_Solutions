// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
        // code here
        int last = arr[arr.length - 1];
        int n = arr.length;
        
        for(int i = n - 1; i > 0 ; i--) {
            arr[i] = arr[i - 1];
        }
        
        arr[0] = last;
        
    }
}