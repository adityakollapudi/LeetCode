class Solution {
    public int countSpecialIntegers(int[] nums) {
        List<Integer> li=new ArrayList<>();
        li.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                li.add(nums[i]);
            }
        }
        Map<Integer,Integer> mp=new HashMap<>();
        for(int num:li){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }

        int count=0;

        for(int num:mp.values()){
            if(num==1){
                count+=1;
            }
        }
        return count;
    }
}