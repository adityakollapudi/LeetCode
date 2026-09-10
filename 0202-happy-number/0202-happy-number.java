class Solution {
    public boolean isHappy(int n) {
        if(n==7) return true;
        int rem;
        int sum=0;
        while(n>9){
            sum=0;
            while(n!=0){
                rem=n%10;
                sum+=rem*rem;
                n/=10;
            }
            n=sum;
            if(sum==7)return true;
        }
        return n==1;
    }
}