# Function should return an integer value
class Solution:
    def convertFive(self, n):
        # Code here
        if n == 0:
            return 5
            
        sum = 0
        place = 1
        
        while n > 0:
            last = n % 10
            
            if last == 0:
                last = 5
            
            sum = place * last + sum;
            
            n //= 10
            place = place * 10
        
        return sum;