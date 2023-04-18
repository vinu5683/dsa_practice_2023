package beginning;

import java.util.Scanner;

public class ArrayPhrase2D {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] arr = new String[n];
        s.nextLine();
        int count = 0;
        for (int i = 0; i < n; i++)
            arr[i] = s.nextLine();
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < arr[i].length(); k++) {
                //left to right
                if (k + 4 <= arr[i].length() && arr[i].charAt(k) == 's' && arr[i].charAt(k + 1) == 'a' && arr[i].charAt(k + 2) == 'b' && arr[i].charAt(k + 3) == 'a')
                    count++;
                //top to bottom
                if (i + 4 <= n && arr[i].charAt(k) == 's' && arr[i + 1].charAt(k) == 'a' && arr[i + 2].charAt(k) == 'b' && arr[i + 3].charAt(k) == 'a') {
                    count++;
                }
                //principle diagonal
                if (i + 4 <= n && k + 4 <= arr[i].length() && arr[i].charAt(k) == 's' && arr[i + 1].charAt(k + 1) == 'a' && arr[i + 2].charAt(k + 2) == 'b' && arr[i + 3].charAt(k + 3) == 'a') {
                    count++;
                }
                //inverse diagonal
                if (i >= 3 && k + 4 <= arr[i].length() && arr[i].charAt(k) == 's' && arr[i - 1].charAt(k + 1) == 'a' && arr[i - 2].charAt(k + 2) == 'b' && arr[i - 3].charAt(k + 3) == 'a') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
//5 5
//        sabaa
//        asaba
//        baabl
//        asabn
//        asnga
