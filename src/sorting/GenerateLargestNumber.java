package sorting;

import java.util.Arrays;


/**
 * find the largest number formed when array is merged
 * can be used the custom sorting or use inbuilt sort method
 **/

public class GenerateLargestNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 8, 97, 87, 4, 9};
        String[] str = new String[arr.length];

        /*
            Sol: using the Sorting method to solve the problem
            First we assume numbers as strings, then we srot them using the
            custom comparator function
         */
        int j = 0;
        for (int i : arr) {
            str[j++] = i + "";
        }

        /*
            here using the custom comparator method and tweaking the arrangement by comparing both the
            values a+b and b+a
         */
        Arrays.sort(str, (a, b) -> {
            if (Integer.parseInt(a + b) > Integer.parseInt(b + a)) {
                return -1;
            } else return 1;
        });
        for (String s : str) {
            System.out.print(s);
        }
    }
}
