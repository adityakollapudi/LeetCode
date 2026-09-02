class Solution {
  public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> li=new ArrayList<>();
        int index;
        for(int i=0;i<nums.length;i++){
            index=Math.abs(nums[i])-1;
            if(nums[index]>=0)
            nums[index]=-nums[index];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                li.add(i+1);
            }
        }
        return li;
    }
}