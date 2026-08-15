class Solution {
    public int longestSubsequence(int[] nums) {
        int xor=0;
        for(int num:nums){
            xor^=num;
        }
        if(xor!=0){
            return nums.length;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                return nums.length-1;
            }
        }
        return 0;
    }
}