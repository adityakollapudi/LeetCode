class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer,ArrayList<Integer>> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hs.containsKey(nums[i])){
                hs.get(nums[i]).add(i);
            }else{
                hs.put(nums[i],new ArrayList<>(Arrays.asList(i)));
            }
        }

        int min = Integer.MAX_VALUE;
        for(int num:hs.keySet()){
            ArrayList<Integer> arr=hs.get(num);
            if(arr.size()>=3){
                for (int i=0;i<=arr.size()-3;i++) {
                    int a=arr.get(i);
                    int b=arr.get(i + 1);
                    int c=arr.get(i + 2);
                    int dis=Math.abs(a-b)+Math.abs(b-c)+Math.abs(c-a);
                    min = Math.min(min,dis);
                }
            }
        }
        return min==Integer.MAX_VALUE?-1:min;

    }
}