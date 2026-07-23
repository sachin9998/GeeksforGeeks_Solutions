class Solution:
    def largest(self, arr):
        # code here
        largest = 0
        
        for i in range(len(arr)):
            if arr[i] > largest:
                largest = arr[i]
        
        return largest
