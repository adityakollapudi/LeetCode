class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder str=new StringBuilder();
        for(char c:s.toCharArray()){
            str.append(binaryString(97+(c-'a')));
        }
        int left=0;
        int right=str.length()-1;
        while(left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left+=1;
            right-=1;
        }
        return true;
    }
    public String binaryString(int n){
        StringBuilder str=new StringBuilder();
        for(int i=0;i<8;i++){
            str.append(n&1);
            n>>=1;
        }
        return str.toString();
    }
}