package two_pointer_method;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
        int k = 17;

        // find the two sum in sorted array.
        // without using extra memory
        sortedTwoSum(arr, k);

        // find the two sum in a unsorted array.
        // here we use the memory with
        // but elements should be distinct
        // using Maps
        unSortedTwoSum(arr, k);
    }

    private static void sortedTwoSum(int[] arr, int k) {
        int i = 0, j;

        while (i < arr.length && arr[i] < k) {
            j = i + 1;
            while (j < arr.length) {
                if (k == arr[i] + arr[j]) {
                    System.out.println("\n i = " + i + " j = " + j);
                    return;
                } else if (k < arr[i] + arr[j])
                    break;
                j++;
            }
            i++;
        }
    }

    private static void unSortedTwoSum(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int finding = k - arr[i];
            if (map.containsKey(finding)) {
                System.out.println("\n i = " + i + " j = " + map.get(finding));
                return;
            } else {
                map.put(arr[i], i);
            }
        }
        System.out.println("Not Found!");
    }
}
