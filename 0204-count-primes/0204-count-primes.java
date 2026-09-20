class Solution {
    public int countPrimes(int n) {
        boolean[] check=new boolean[n];
        for(int i=0;i<n;i++){
           check[i]=true;
        }
        // check[0]=false;
        // check[1]=false;
        for(int i=2;i*i<n;i++){
            if(check[i]){
                for(int j=i*i;j<n;j+=i){
                    check[j]=false;
                }
            }
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(check[i]){
                count+=1;
            }
        }

        return count;
    }
}