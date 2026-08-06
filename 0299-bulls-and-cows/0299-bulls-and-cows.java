class Solution {
    public String getHint(String secret, String guess) {
        int[] secretFreq=new int[10];
        int[] guessFreq=new int[10];
        int bull=0;
        int cow=0;

        for (int i=0;i<secret.length();i++) {
            char sChar=secret.charAt(i);
            char gChar=guess.charAt(i);

            if (sChar==gChar) {
                bull++;
            } else {
                secretFreq[sChar-'0']++;
                guessFreq[gChar-'0']++;
            }
        }
        for (int d=0;d<10;d++) {
            cow+=Math.min(secretFreq[d],guessFreq[d]);
        }

        return bull + "A" + cow + "B";
    }
}