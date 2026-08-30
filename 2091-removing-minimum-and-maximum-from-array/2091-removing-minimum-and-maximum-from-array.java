class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1)return 1;
        if(nums.length==2)return 2;
        int argMin=0;
        int argMax=0;
        for(int i=0;i<nums.length;i++){
            if(nums[argMin]>nums[i]){
                argMin=i;
            }
            if(nums[argMax]<nums[i]){
                argMax=i;
            }
        }
        int i=Math.min(argMax,argMin);
        int j=Math.max(argMax,argMin);

        int option1=(j+1);

        int option2=(nums.length-i);

        int option3=(i+1)+(nums.length-j);

        return Math.min(option1,Math.min(option2,option3));
    }
}