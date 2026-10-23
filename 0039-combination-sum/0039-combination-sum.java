class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> li=new ArrayList<>();
        combSum(candidates,target,0,li,new ArrayList<>());
        return li;
    }
    public void combSum(int[] condidates,int target,int idx,List<List<Integer>> li,List<Integer> ds){
        if(idx==condidates.length){
            if(target==0){
            li.add(new ArrayList(ds));
            }
            return;
        }

        if(condidates[idx]<=target){
            ds.add(condidates[idx]);
            combSum(condidates,target-condidates[idx],idx,li,ds);
            ds.remove(ds.size()-1);
        }
        combSum(condidates,target,idx+1,li,ds);
    }
}