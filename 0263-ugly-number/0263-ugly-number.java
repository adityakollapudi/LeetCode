class Solution {
    public boolean isUgly(int n) {
        if(n<=0)return false;
       for(int factors:new int[]{2,3,5}){
        while(n%factors==0){
            n/=factors;
        }
       }
       return n==1;
    }
}