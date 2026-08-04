class Solution {
    public int maximumPopulation(int[][] logs) {
        int diff[]=new int[101];
        for(int i=0;i<logs.length;i++){
            diff[logs[i][0]-1950]++;
            diff[logs[i][1]-1950]--;
        }
        int maxpop=0;
        int currpop=0;
        int ans=1950;
        for(int i=0;i<101;i++){
            currpop+=diff[i];
            if(currpop>maxpop){
                maxpop=currpop;
                ans=1950+i;
            }
        }
        return ans;

    }
}