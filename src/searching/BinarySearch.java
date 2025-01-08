package searching;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 5, 6, 3, 6, 3, 433, 4, 66, 2, 11, 5450, 3, 3455, 32, 34, 56, 33};
        int key = 32;

        Arrays.sort(arr);
        System.out.println();

        for (int i : arr)
            System.out.print(" " + i);
        System.out.println();

        int start = 0;
        int end = arr.length - 1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == key) {
                System.out.println("YEY Found at " + mid);
                return;
            }
            if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("Nah... Not Found");
    }
}
