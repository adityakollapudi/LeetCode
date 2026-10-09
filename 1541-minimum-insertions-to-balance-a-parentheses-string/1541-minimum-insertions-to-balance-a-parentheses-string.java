class Solution {
    public int minInsertions(String s) {
        int insertions = 0;
        int openBrackets = 0;  
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                openBrackets++;
            } else {
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++; 
                } else {
                    insertions++;
                }
                if (openBrackets > 0) {
                    openBrackets--;
                } else {
                    insertions++;
                }
            }
        }
        insertions += openBrackets * 2;       
        return insertions;
    }
}