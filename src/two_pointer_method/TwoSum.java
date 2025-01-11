package two_pointer_method;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
        int k = 7;

        // find the two sum in sorted array.
        // without using extra memory
        sortedTwoSum(arr, k);

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
}
