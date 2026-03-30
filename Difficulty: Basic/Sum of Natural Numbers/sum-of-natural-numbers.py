class Solution:
    def findSum(self, n):
        # code here
        result = 0
        for i in range(1, n + 1):
            result += i
        
        return result;
        
