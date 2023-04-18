package beginning;

import java.util.Scanner;

public class WeightedSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = s.nextInt();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += (arr[i] * (i + 1));
            }
            System.out.println(sum);
        }
    }
}
