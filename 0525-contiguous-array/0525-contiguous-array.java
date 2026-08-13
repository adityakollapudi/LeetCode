class Solution {
    public int findMaxLength(int[] nums) {
        int sum=0;
        HashMap<Integer,Integer> hs=new HashMap<>();
        hs.put(0,-1);
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum+=-1;
            }else{
                sum+=1;
            }
            if(hs.containsKey(sum)){
                max=Math.max(max,(i-hs.get(sum)));
            }else{
                hs.put(sum,i);
            }
        }
        return max;
    }
}