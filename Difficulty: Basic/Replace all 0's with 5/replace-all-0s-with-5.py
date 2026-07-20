class Solution:
    def convertFive(self, n):
        if n == 0:
            return 5
        
        count = 0
        place = 1
        
        while n > 0:
            
            last = n % 10
            
            if last == 0:
                last = 5
            
            count = last * place + count
            
            place = place * 10
            
            n //= 10
        
        
        return count