class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> li=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        int arr[]=new int[max+1];
        for(int i:nums){
            arr[i]=i;
        }
        for(int i=min;i<=max;i++){
            if(arr[i]==0)li.add(i);
        }
        return li;
    }
}