// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        
        int originalNumber = n;
        int sum = 0;
        
        while(n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n = n / 10;
        }
        
        return sum == originalNumber;
    }
}