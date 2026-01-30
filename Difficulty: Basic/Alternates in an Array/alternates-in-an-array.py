class Solution:
    def getAlternates(self, arr):
        n = len(arr)
        res = []
        
        for i in range(0, n, 2):
            res.append(arr[i])
            
        return res