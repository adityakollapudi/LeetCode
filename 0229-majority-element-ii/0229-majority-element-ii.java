class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> hs=new HashMap<>();
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }
        for (Map.Entry<Integer, Integer> hs1 : hs.entrySet()) {
            if (n / 3 < hs1.getValue()) {
            li.add(hs1.getKey());
            }
        }

        return li;
    }
}