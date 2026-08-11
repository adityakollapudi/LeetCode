class Solution {
    public int missingInteger(int[] nums) {
        int sum=0;
        sum+=nums[0];
        for(int j=1;j<nums.length;j++){
            if(nums[j]==nums[j-1]+1){
                sum+=nums[j];
            }else{
                break;
            }
        }
        HashSet<Integer> set=new HashSet<>();
        for (int num:nums) {
            set.add(num);
        }
        while (set.contains(sum)) {
            sum++;
        }
        return sum;
    }
}