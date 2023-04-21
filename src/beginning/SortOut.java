package beginning;

import java.util.Scanner;

public class SortOut {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int[] indexArray = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            indexArray[i] = i;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    temp = indexArray[j];
                    indexArray[j] = indexArray[j + 1];
                    indexArray[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++)
            System.out.print(indexArray[i] + " ");
    }
}
