// https://leetcode.com/problems/divide-two-integers

class Solution {
    public int divide(int dividend, int divisor) {
           if(dividend == 0) {
            return 0;
        }
        
        // for integer minimum divisible by -1 will go beyond INT_MAX, so return INT MAX
        if(dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
          
        boolean shouldMakeQuotientNegative = true;
        // if both dividend and divisor are negative or positive, the quotient will be positive
        if((dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0)) {
            shouldMakeQuotientNegative = false;
        }
        
    
        if(dividend > 0) {
            dividend = 0 - dividend;
        }
        if(divisor > 0) {
            divisor = 0 - divisor;
        }

        int quotient = 0;
        while(dividend <= divisor) {
            dividend = dividend - divisor;
            quotient++;
        }
        
        if(shouldMakeQuotientNegative && quotient > 0) {
            // make negative
            return 0 - quotient;
        } else if(!shouldMakeQuotientNegative && quotient < 0) {
            // make positive
            return 0 - quotient;
        } else {
            // return as-is
            return quotient;
        }
    }
}