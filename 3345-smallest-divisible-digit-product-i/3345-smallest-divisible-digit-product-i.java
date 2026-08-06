class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;n<=100;i++){
            if(product(i)%t==0){
                return i;
            }
        }
        return -1;
    }
    public int product(int n){
        int product=1;
        while(n!=0){
            int rem=n%10;
            product*=rem;
            n/=10;
        }
        return product;
    }
}