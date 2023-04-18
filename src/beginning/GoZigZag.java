package beginning;

import java.util.Scanner;

public class GoZigZag {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] arr = new int[n][m];
        for (int i=0;i<n;i++)
            for (int j = 0;j<m;j++)
                arr[i][j] = s.nextInt();
        boolean isReverseTraversal = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(((isReverseTraversal) ? arr[i][m - j - 1] : arr[i][j]) + " ");
            }
            isReverseTraversal = !isReverseTraversal;
        }
    }
}
