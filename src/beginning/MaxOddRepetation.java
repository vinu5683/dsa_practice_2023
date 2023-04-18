package beginning;

import java.util.Scanner;

public class MaxOddRepetation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        int maxCount = 0;
        int count = 0;
        int lastChar = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maxCount == 0 && arr[i] % 2 == 1)
                maxCount = 1;
            if (arr[i] % 2 == 1 && arr[i] == lastChar) {
                count++;
                if (count > maxCount)
                    maxCount = count;
            } else {
                count = 1;
            }
            lastChar = arr[i];
        }
        System.out.println(maxCount);
    }
}
