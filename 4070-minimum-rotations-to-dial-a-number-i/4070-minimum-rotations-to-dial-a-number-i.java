class Solution {
    public int minRotations(String s) {
        int count=0;
        int pointer=0;
        for(int i=0;i<s.length();i++){
            int target = s.charAt(i) - '0';
            int d = Math.abs(target - pointer);
            count += Math.min(d, 10 - d); 
            pointer = target; 
        }
        return count;
    }
}