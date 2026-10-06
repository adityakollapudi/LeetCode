class Solution {
    public int minAddToMakeValid(String s) {
        int count=0;
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('){
                st.push('(');
            }else{
                if(!st.isEmpty()){
                    st.pop();
                }else{
                    count+=1;
                }
            }
        }
        return count+st.size();
    }
}