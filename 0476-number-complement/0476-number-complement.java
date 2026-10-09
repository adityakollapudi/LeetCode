class Solution {
    public int findComplement(int num) {
        if(num==1)return 0;

        int count=(int)(Math.floor(Math.log(num)/Math.log(2)))+1;

        int mask=(1<<count)-1;
        return num^mask;
    }
}