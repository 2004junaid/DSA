package Strings;

import java.util.HashMap;
import java.util.Map;

public class RomanToNumerals {
    public static void main(String args[]) {
        String s = "IV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ans = 0; // final answer
        for (int i = 0; i < s.length(); i++) {
            // If next numeral is bigger, subtract current value
            // for example IV where the value will be 5-1 which is 4.
            // I is smaller and there before V which is the bigger value therefore
            // substract.
            if (i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                ans -= map.get(s.charAt(i));
            } else {
                ans += map.get(s.charAt(i));
            }
        }
        return ans;
    }
}
