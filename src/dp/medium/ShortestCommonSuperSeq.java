package dp.medium;


import java.util.Arrays;

/**
 * if s1 is "acbcf" and s2 is "abcdaf" the shortest common super sequence [SCS] is "acbcdaf"
 * which is a shortest length of super sequence for both strings.
 *
 * APPROACH IS - lets find the LCS[Longest common subsequence] for both s1 and s2.
 * then SCS will be LCS + [s1.len - LCS] + [s2.len - LCS]. that is s1.length() + s2.length() - LCS.
 */
public class ShortestCommonSuperSeq {
    public static void main(String[] args) {
        String s1 = "acbcf";
        String s2 = "abcdaf";
        int m = s1.length()-1;
        int n = s2.length()-1;
        dp = new int[m+1][n+1];
        for(int[] row: dp)
            Arrays.fill(row,-1);
        int lcs = lcs(s1,s2,m,n);
        System.out.println("Longest common subsequence length is - "+lcs);
        System.out.println("Shortest Common Super Sequence is - "+(s1.length()+s2.length()-lcs));
    }
    static int[][] dp;

    private static int lcs(String s1, String s2, int m, int n) {
        if(m==-1 || n==-1)
            return 0;
        if(dp[m][n]!=-1)
            return dp[m][n];

        if(s1.charAt(m)==s2.charAt(n)){
            return dp[m][n] = 1+lcs(s1,s2,m-1,n-1);
        }else {
            return dp[m][n] = Math.max(lcs(s1,s2,m,n-1),lcs(s1,s2,m-1,n));
        }
    }
}
