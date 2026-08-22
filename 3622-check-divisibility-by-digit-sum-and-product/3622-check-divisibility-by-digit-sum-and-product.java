class Solution {
    public boolean checkDivisibility(int n) {
        long product=1;
        long sum=0;
        int num=n;
        while(num!=0){
            sum+=num%10;
            product*=num%10;
            num/=10;
        }
        System.out.println(sum+" "+product);
        return (sum+product!=0) && (n%(sum+product)==0);
    }
}