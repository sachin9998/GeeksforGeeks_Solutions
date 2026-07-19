class Solution:
    def getAlternates(self, arr):
        # Code Here
        ans = []
        
        for i in range(len(arr)):
            if i % 2 == 0:
                ans.append(arr[i])
                
        return ans