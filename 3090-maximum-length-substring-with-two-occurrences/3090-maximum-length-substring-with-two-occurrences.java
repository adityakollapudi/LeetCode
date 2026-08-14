class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq=new int[26];
        int max=Integer.MIN_VALUE;
        int left=0;
        int right=0;
        while(right<s.length()){
            freq[s.charAt(right)-'a']+=1;
            while(freq[s.charAt(right)-'a']>2){
                freq[s.charAt(left)-'a']--;
                left++;
            }
            if(freq[s.charAt(right)-'a']<=2){
                max=Math.max(max,right-left+1);
            }
            right+=1;
        }
        return max;
    }
}