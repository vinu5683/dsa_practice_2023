package beginning;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindAllThePairs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] arr = new int[n];
            int count = 0;
            for (int i = 0; i < n; i++)
                arr[i] = s.nextInt();

            //Basic Solution with TLE
//            for (int i = 0; i < n - 1; i++) {
//                for (int j = i + 1; j < n; j++) {
//                    if (i!=j && (arr[i] * 2 == arr[j] * 3 || arr[i] * 3 == arr[j] * 2)) {
//                        count++;
//                    }
//                }
//            }

            //Efficient Way

            HashMap<Integer, Integer> hashMap = new HashMap<>();

            for (int i = 0; i < n; i++) {
                if (hashMap.containsKey(arr[i])) {
                    int temp = hashMap.get(arr[i]);
                    hashMap.put(arr[i], temp + 1);
                } else hashMap.put(arr[i], 1);
            }
            int[] minimizedArray = new int[hashMap.keySet().size()];
            int hashIndex = 0;
            for (Map.Entry<Integer, Integer> map : hashMap.entrySet()) {
                minimizedArray[hashIndex++] = map.getKey();
            }

            for (int i = 0; i < minimizedArray.length - 1; i++) {
                for (int j = i + 1; j < minimizedArray.length; j++) {
                    if (i != j && (2 * minimizedArray[i] == 3 * minimizedArray[j] || 2 * minimizedArray[j] == 3 * minimizedArray[i])) {
                        count += hashMap.get(minimizedArray[i]) * hashMap.get(minimizedArray[j]);
                    }
                }
            }
            int zeroCount = hashMap.getOrDefault(0, 0);
            count += (( zeroCount * (zeroCount - 1)) / 2);

            System.out.println(count);
        }
    }
}