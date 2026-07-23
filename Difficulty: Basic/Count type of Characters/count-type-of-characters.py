class Solution:
    def count (self,s):
        # your code here
        upper = 0
        lower = 0
        numeric = 0
        special = 0
        
        for char in s:
            if char.isupper():
                upper += 1
            elif char.islower():
                lower += 1
            elif char.isdigit():
                numeric += 1
            else:
                special += 1
        
        return [upper, lower, numeric, special]