package org.rouvsen;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static int romanToInt(String s) {
        Map<Character, Integer> romans = new HashMap<>();

//        Input: s = "III"
//        Output: 3
//        Explanation: III = 3.
//
//        Input: s = "LVIII"
//        Output: 58
//        Explanation: L = 50, V= 5, III = 3.
//
//        Input: s = "MCMXCIV"
//        Output: 1994
//        Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);

        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && romans.get(s.charAt(i)) < romans.get(s.charAt(i + 1))) {
                answer -= romans.get(s.charAt(i));
            } else {
                answer += romans.get(s.charAt(i));
            }
        }

        return answer;
    }

}
