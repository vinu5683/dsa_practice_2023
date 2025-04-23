package dp.basics;


/*
You can take 1 or 2 steps at a time. How many ways can you reach the top of n stairs?
 */
public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 20;
        int[] memo = new int[n + 1];
        climb(0, n, memo);
        System.out.println(memo[0]);
    }

    private static int climb(int i, int n, int[] memo) {
        if (i == n) {
            return 1;
        } else if (i > n) {
            return 0;
        }
        if(memo[i]!=0) return memo[i];
        return memo[i] = climb(i + 1, n, memo) + climb(i + 2, n, memo);

    }

}
/*
bruteforce

 */
