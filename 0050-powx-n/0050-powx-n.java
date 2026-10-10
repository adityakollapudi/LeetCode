class Solution {
    public double myPow(double x, int n) {
        long exp = n;        

        if (exp < 0) {
            x = 1.0 / x;      
            exp = -exp;     
        }

        double result = 1.0;
        double base = x;

        while (exp > 0) {
            if ((exp & 1L) == 1L) {  
                result *= base;
            }
            base *= base;             
            exp >>= 1;                
        }

        return result;
    }
}
