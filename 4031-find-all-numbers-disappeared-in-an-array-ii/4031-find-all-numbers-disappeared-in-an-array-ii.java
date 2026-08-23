class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        int itr=0;
        List<List<Integer>> li=new ArrayList<>();
        long lastval=lower;
        for(int num:nums){
            if(num<lower){
                continue;
            }
            if(num>upper){
                break;
            }
            if(num>lastval){
                li.add(Arrays.asList((int)lastval,num-1));
            }
            lastval=(long) num+1;
        }

        if(lastval<=upper){
            li.add(Arrays.asList((int)lastval,upper));
        }
        return li;
    }
}