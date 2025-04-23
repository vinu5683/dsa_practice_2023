package dp.medium;

public class LongestCommonSubstring {
    static int longest = 0;
    public static void main(String[] args) {
        String s1 = "abcdefa";
        String s2 = "dbcbcdea";
        int m = s1.length()-1;
        int n = s2.length()-1;

        System.out.println("Longest Common Substring - " + lcss(s1,s2,m,n));
    }

    //Not complete check for the solution https://leetcode.com/problems/maximum-length-of-repeated-subarray/description/
    private static int lcss(String s1, String s2, int m, int n) {

        if(m==-1 || n==-1)
            return 0;

        int max = 0;
        if(s1.charAt(m)==s2.charAt(n)){
            longest = Math.max(max, 1+lcss(s1,s2,m,n));
        }
        return lcss(s1,s2,m-1,n);

    }
}

/**
 *
 * First check in a recursion saying, m-1 == n-1 of string character/ array index.
 * if equal increase one in main answer and do the recursive success call
 * if once it's failed note the maxAnswer from current and previoulsy generated answer
 * and do the recursove calls for including n-1 and m then do n and m-1.
 * once done print the maxAnswer saved.
 */
