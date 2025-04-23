package beginning;

import java.util.HashSet;

class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.lengthOfLongestSubstring("pwwkew"));
    }

    public int lengthOfLongestSubstring(String s) {

        int start = 0;
        int end = s.length();
        int output = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (checkIfWeHaveMatching(s, mid)) {
                output = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return output;

    }

    public boolean checkIfWeHaveMatching(String str, int window) {
        int n = str.length();
        for (int i = 0; i < n && (n - i) >= window; i++) {
            HashSet<Character> set = new HashSet<>();
            int j;
            for (j = i; j < i + window; j++) {
                char ch =str.charAt(j);
                if (!set.contains(ch)) {
                    set.add(ch);
                } else
                    break;
            }
            if (j == i + window) {
                return true;
            }
        }
        return false;
    }
}
