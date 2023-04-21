package beginning;

import java.util.Scanner;

public class SumWithoutBorders {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int m = s.nextInt();
            int[][] arr = new int[n][m];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++)
                    arr[i][j] = s.nextInt();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (i != 0 && j != 0 && i != n - 1 && j != m - 1) {
                        sum += arr[i][j];
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
