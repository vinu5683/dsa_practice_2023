package two_pointer_method;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LongestNonRepeatingSubString {
    public static void main(String[] args) {
        String s = "pwkepw";
        System.out.println("Longest non repeating substring length: " + lengthOfLongestSubstring(s));
    }

    // Logic using the two pointer method and using the space O(N)
    // scan characters from left to right and keep i & j as zero at first
    // j will be running faster, i will be running slow.
    // keeping the map to store char & it's index.
    // once the character is repeating will check the i is moved on the index or not.
    // if it's not moved, will move the i last repeating character. and change the
    // longestSoFar to j - i + 1 saying that the new lengthSoFar From i to j.
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Map<Character, Integer> hash = new HashMap<>();
        int longest = 0;
        int longestSoFar = 0;
        int i = 0, j = 0;

        while (j < n) {
            char ch = s.charAt(j);
            if (hash.containsKey(ch) && hash.get(ch) >= i) {
                i = hash.get(ch) + 1;
                longestSoFar = j - i + 1;
                hash.put(ch, j);
            } else {
                longestSoFar++;
                if (longest < longestSoFar)
                    longest = longestSoFar;
                hash.put(ch, j);
            }
            j++;
        }
        return longest;
    }
}
