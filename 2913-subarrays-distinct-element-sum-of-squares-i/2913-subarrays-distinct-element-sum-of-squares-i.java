class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            Set<Integer> s=new HashSet<>();
            for(int j=i;j<nums.size();j++){
                s.add(nums.get(j));
                int count=s.size();
                sum+=(count*count);
            }
        }
        return sum;
    }
}