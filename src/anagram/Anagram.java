package anagram;

import java.util.HashMap;

public class Anagram {

    public static boolean isAnagramHashMap(String s1, String s2) {
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        if (s1.length() != s2.length()) return false;
        var n = s1.length();
        var char_map_s1 = new HashMap<Character, Integer>();
        var char_map_s2 = new HashMap<Character, Integer>();

        for (int i = 0; i < n; i++) {
            var current_1 = s1.charAt(i);
            char_map_s1.merge(current_1, 1, Integer::sum);

            var current_2 = s2.charAt(i);
            char_map_s2.merge(current_2, 1, Integer::sum);
        }
        return char_map_s1.equals(char_map_s2);

    }

    public static boolean isAnagramArray(String s1, String s2) {
        s1 = s1.replaceAll("\\s", "").toLowerCase(); // replacing all whitespaces and upper case letters
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }

        char char_range = 26; // alphabet range
        var chars = new char[char_range];


        for (int i = 0; i < s1.length(); i++) {
            chars[s1.charAt(i)]++;
            chars[s2.charAt(i)]--;
        }

        for (char c : chars) if (c != 0) return false;

        return true;
    }
}