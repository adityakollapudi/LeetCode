//import java.util.Math;
class Solution {
    public int mySqrt(int n) {
        double x=n/2.0;
        double x_new;
        x_new=(x+(n/x))/2;
        for(int i=0;Math.abs(x_new * x_new - n) > 0.0001;i++){
            x_new=(x_new+(n/x_new))/2;
        }
        return (int)x_new;
    }
}