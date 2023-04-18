package beginning;

import java.util.Scanner;

public class MotuPotlu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n / 5 != 0) {
            if (n % 5 != 0) System.out.println((n / 5) + 1);
            else System.out.println(n / 5);
        }else System.out.println("1");
    }
}
