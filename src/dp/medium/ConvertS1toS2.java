package dp.medium;

import java.util.Arrays;

/**
 * Convert from s1 - "pea" to s2 - "heap"
 * you can perform insertion/deletion operations on s1 to make it s2.
 * for every insertion you can insert any character into s1,
 * for every deletion you can delete any character from s1.
 * how many minimum operations are required to make s1 to s2.
 *
 * APPROACH -
 * calculate the Longest Common Sub-Sequence [LCS],
 * deletion Operations count - s1.length() - LCS
 * insertion Operations count - s2.length() - LCS
 *
 * answer is s1.length()+s2.length()-(2*LCS)
 */
public class ConvertS1toS2 {
    public static void main(String[] args) {
        String s1 = "pea";
        String s2 = "heap";

        int m = s1.length();
        int n = s2.length();

        dp = new int[m][n];

        for(int[] eachRow: dp){
            Arrays.fill(eachRow,-1);
        }

        int lcs = LCS(s1,s2,m-1,n-1);

        System.out.println("converting s1 - " + s1 + " to s2 - " + s2 + " requires " + (m + n - (lcs * 2)) + " operations");
    }

    static int[][] dp;

    public static int LCS(String s1, String s2, int m, int n){
        //base condition
        if(m==-1 || n==-1){
            return 0;
        }

        if(dp[m][n]!=-1){
            return dp[m][n];
        }

        if(s1.charAt(m) == s2.charAt(n)){
            return dp[m][n] = 1+LCS(s1,s2,m-1,n-1);
        }else {
            return dp[m][n] = Math.max(LCS(s1,s2,m-1,n), LCS(s1,s2,m,n-1));
        }
    }
}
