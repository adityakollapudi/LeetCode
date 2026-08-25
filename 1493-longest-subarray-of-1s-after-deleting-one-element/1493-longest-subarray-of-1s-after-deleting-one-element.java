class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        int left=0;
        int count=0;
        int right=0;
        while(right<nums.length){
            if(nums[right]==0){
                count+=1;
            }
            while(count>1){
                if(nums[left]==0){
                    count-=1;
                }
                left++;
            }
            max=Math.max(max,right-left);

            right++;
        }
        return max;
    }
}