package beginning;

import java.util.Scanner;

public class SumOfMultiples {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int y = s.nextInt();
        int k = s.nextInt();
        int sum = 0;

        for (int i = 1; i <= y; i++) {
            if (n * i % k == 0) {
                sum = sum + n * i;
            }
        }
        System.out.println(sum);
    }
}
