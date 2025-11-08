package Strings;

import java.util.HashMap;
import java.util.Map;

public class SortingByFrequency {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));

    }

    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else { // first occurence
                map.put(ch, 1);
            }
        }
        int maxLength = s.length();
        StringBuilder[] buckets = new StringBuilder[maxLength + 1];
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char ch = entry.getKey();
            int freq = entry.getValue();
            if (buckets[freq] == null) { // checking if the bucket of the particular character exists.
                buckets[freq] = new StringBuilder();
            }
            for (int i = 0; i < freq; i++) { // appending the character to the bucket string with number of frequency
                buckets[freq].append(ch);
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = maxLength; i > 0; i--) { // start from max freq
            if (buckets[i] != null) { // copying the bucket to the result frequency wise.
                result.append(buckets[i]);
            }
        }
        return result.toString();
    }
}
