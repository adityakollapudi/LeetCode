class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        HashMap<Integer,Integer> hs=new HashMap<>();
        int left=0;
        int right=0;
        while(right<nums.length){
            hs.put(nums[right],hs.getOrDefault(nums[right],0)+1);
            while(hs.get(nums[right])>k){
                hs.put(nums[left],hs.get(nums[left])-1);
                if(hs.get(nums[left])==0){
                    hs.remove(nums[left]);
                }
                left++;
            }
            max=Math.max(max,(right-left+1));
            right++;
        }
        return max;
    }
    
}