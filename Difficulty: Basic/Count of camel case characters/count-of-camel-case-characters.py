class Solution:
    def countCamelCase (self,s):
        # your code here
        count = 0
        
        for ch in s:
            if ch.isupper():
                count += 1
        
        return count