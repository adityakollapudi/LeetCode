class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int left=0;
        int right=0;
        int leftidx=0;
        int rightidx=0;
        int count=0;
        int min=Integer.MAX_VALUE;
        while(right<s.length()){
            if(s.charAt(right)=='1'){
                count+=1;
            }
            while(count>k){
                if(s.charAt(left)=='1')count-=1;
                left+=1;
            }
            while(left<s.length() && s.charAt(left)=='0'){
                left++;
            }
            if(count==k){
                if(min>(right-left+1)){
                    min=(right-left+1);
                    leftidx=left;
                    rightidx=right;
                }
                else if (min==(right-left+1)) {
                    String current = s.substring(left, right + 1);
                    String previous = s.substring(leftidx, rightidx + 1);
                    if (current.compareTo(previous) < 0) {
                        leftidx = left;
                        rightidx = right;
                    }
                }
            }
            right+=1;

        }
        return min==Integer.MAX_VALUE? "" : s.substring(leftidx,rightidx+1);
    }
}