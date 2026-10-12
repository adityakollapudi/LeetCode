class Solution {
    public boolean threeFibonacciSum(int n) {
        if(n%2!=0){
            return false;
        }
        int a=0;
        int b=1;
        int sum=0;
        while(sum<n){
            int x=a+b;
            sum=x*2;
            a=b;
            b=x;
            if(sum==n){
                return true;
            }
        }
        return false;

    }
}