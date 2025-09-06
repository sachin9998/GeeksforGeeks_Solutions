class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int first = -1;
        int second = -1;
        int n = arr.length;
        
        for(int i = 0; i < n; i++) {
            if(arr[i] > first) {
                second = first;
                first = arr[i];
            }
            
            if(arr[i] < first && arr[i] > second) {
                second = arr[i];
            }
        }
        
        return second;
    }
}