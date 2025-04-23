package dp.basics;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 80;
        long[] memo = new long[n + 1];
        memo[0] = 0;
        memo[1] = 1;

        fibonacciRecursive(n, memo);
        for (int i = 0; i <= n; i++) {
            System.out.println(memo[i]);
        }

    }

    private static long fibonacciRecursive(int n, long[] memo) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(memo[n]!=0) return memo[n];
        memo[n] = fibonacciRecursive(n-1, memo) + fibonacciRecursive(n-2, memo);
        return memo[n];
    }
}
