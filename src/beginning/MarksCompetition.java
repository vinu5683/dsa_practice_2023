package beginning;

import java.util.Scanner;

public class MarksCompetition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        StringBuilder output = new StringBuilder();
        int i = arr.length - 1;
        int largestMark = Integer.MIN_VALUE;
        for (; i > 0; i--) {
            if (largestMark <= arr[i]) {
                output.insert(0, arr[i] + " ");
                largestMark = arr[i];
            }
        }
        System.out.println(output);
    }
}
