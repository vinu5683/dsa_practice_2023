package sorting.partition_varients;

public class AlternatePositiveNegative {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 5, 2, 1, 3, -1, -4, -2, -50, -10, 2, -20, 80, -80,-5};
        System.out.println("\ninput:");
        for (int i : arr)
            System.out.print(i + " ");

        int pivot = solve(arr, 0, arr.length - 1);

        System.out.println("\nOutput:");

        for(int j=0;j<arr.length/2;j++){
            System.out.print(" "+arr[j]+ " " + arr[j+pivot]);
        }
    }

    private static int solve(int[] arr, int low, int high) {
        int pivot = 0;
        int i = low - 1;

        for (int j = low; j <= high; j++) {
            if (arr[j] > pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        //at this point we will be having the mid-point of the array which is
        //equally positive negative separated at the index 'i'
        //will print now
        return i+1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
