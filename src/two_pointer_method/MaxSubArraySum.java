package two_pointer_method;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, -42, -54, 6, 2, -56, 7, 2, 3, -5, 67, -32, -454, 6, -674, 4, 6, 7, -73, 3, -23, 4, -67, -66, 6, -74, -45};
        int i = 0, j = 0; // 2 pointers
        int maxSumSoFar = 0;
        int maxSum = 0;

        // we use kadane's algo here
        // using 2 pointer method and traversing through out the array linearly, so once the maxSumSoFar becomes 0 or less
        // will make the maxSumSoFar to 0 also move the i pointer to the j+1 and traverse till the array is covered.
        // for every array element is traversed, will be checking if the maxSum is less than the maxSumSoFar.
        // if yes will record it as a maxSum.

        while (i < arr.length && j < arr.length) {
            if (maxSumSoFar+arr[j]>0){ //change the sign for smallest sum
                maxSumSoFar += arr[j];
            }else{
                maxSumSoFar=0;
                i=j+1;
            }

            if(maxSum<maxSumSoFar) //change the sign for smallest sum
                maxSum = maxSumSoFar;
            j++;
        }
        System.out.println(maxSum);
    }
}
