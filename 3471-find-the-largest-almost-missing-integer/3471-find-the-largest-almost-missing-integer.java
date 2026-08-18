class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<=nums.length-k;i++){
            HashSet<Integer> hs=new HashSet<>();
            for(int j=i;j<i+k;j++){
                hs.add(nums[j]);
            }
            for(int l:hs){
                hm.put(l,hm.getOrDefault(l,0)+1);
            }
        }
        int max=-1;
        for(int x:nums){
            if(hm.getOrDefault(x,0)==1){
                max=Math.max(max,x);
            }
        }
        return max;

    }
}