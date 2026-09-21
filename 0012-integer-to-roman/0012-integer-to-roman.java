
import java.util.*;

class Solution{

    public String intToRoman(int num) {
        TreeMap<Integer, String> hs = new TreeMap<>(Collections.reverseOrder());
        hs.put(1000, "M");
        hs.put(900, "CM");
        hs.put(500, "D");
        hs.put(400, "CD");
        hs.put(100, "C");
        hs.put(90, "XC");
        hs.put(50, "L");
        hs.put(40, "XL");
        hs.put(10, "X");
        hs.put(9, "IX");
        hs.put(5, "V");
        hs.put(4, "IV");
        hs.put(1, "I");
        StringBuilder s = new StringBuilder("");
        for (int key : hs.keySet()) {
            while (num >= key) {
                s.append(hs.get(key));
                num -= key;
            }
        }
        return s.toString();
    }
}