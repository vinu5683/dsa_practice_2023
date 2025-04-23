package dp.basics;

import java.util.ArrayList;
import java.util.List;

public class SubsetSum {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 6, 3, 2, 7, 9};
        int sum = 7;

        solveSubsetSum(arr, sum, arr.length, 0,"");
        System.out.println(isSubsetSumFound + "  " + subSet);
    }

    static boolean isSubsetSumFound = false;
    static List<String> subSet = new ArrayList<>();

    private static void solveSubsetSum(int[] arr, int sum, int n, int index, String str) {

        if (sum == 0) {
            isSubsetSumFound = true;
            subSet.add(str);
            return;
        }
        if(index==n) return;
        //include condition
        if (isSubsetSumFound || sum < 0) {
            return;
        } else {
            for (int i = index; i < n; i++) {
                solveSubsetSum(arr, sum - arr[i], n, i+1, str+arr[i]);
                solveSubsetSum(arr, sum, n, i+1,str);
            }
        }
    }
}