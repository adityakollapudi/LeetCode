class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] num=new int[nums1.length];
        Stack<Integer> st=new Stack<>();
        Map<Integer,Integer> hs=new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<nums2[i]){
                st.pop();
            }
            hs.put(nums2[i],st.isEmpty()? -1 : st.peek());
            st.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            num[i]=hs.get(nums1[i]);
        }
        return num;
    }
    
}