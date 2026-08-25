class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> hs=new HashSet<>();
        for(int num:nums){
            hs.add(num);
        }

        int val=0;
        int i;
        for(i=k;i<=100;i+=k){
           if(!hs.contains(i)){
                val=i;
                break;
           }
        }
        return val==0?i:val;

    }
}