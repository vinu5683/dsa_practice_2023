package beginning;

import java.util.Scanner;
import java.lang.System;

public class SwastikSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                arr[i][j] = s.nextInt();

        int sum1 = 0, sum2 = 0;
        int rowMid = n / 2;
        int colMid = m / 2;
        //sum1's corner swastikas sum
        for (int i = 0; i < rowMid; i++) {
            sum1 += arr[i][0] + arr[n - i - 1][m - 1];
        }
        //sum1's middle sum
        for (int i = 0; i < m; i++)
            sum1 += arr[rowMid][i];

        //sum2's corner swastikas sum
        for (int i = 0; i < colMid; i++) {
            sum2 += arr[n - 1][i] + arr[0][m - i - 1];
        }
        //sum2's middle sum
        for (int i = 0; i < n; i++)
            sum2 += arr[i][colMid];

        System.out.println(Math.abs(sum1 - sum2));

    }
}