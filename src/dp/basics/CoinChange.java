package dp.basics;

public class CoinChange {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[]{1, 2};
        int target = 4;

        findCoinChange(arr, 0, target, 0);
        System.out.println(count);
    }

    static int count = 0;

    private static void findCoinChange(int[] arr, int index, int target, int sum) {
        if (target == sum) {
            count++;
            return;
        }
        for (int i = index+1; i < arr.length; i++) {
            findCoinChange(arr, i, target, sum);
            findCoinChange(arr, i + 1, target, sum+arr[i]);
        }
    }
}
