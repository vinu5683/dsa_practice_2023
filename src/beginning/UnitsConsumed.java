package beginning;

import java.util.Scanner;

public class UnitsConsumed {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        num = num - 80; //850
        if (num / 3 <= 50) {
            System.out.println(num / 3);
        } else if ((num - 150) / 5 <= 100) {
            System.out.println(((num - 150) / 5 )+50);
        } else System.out.println(((num - 150 - 500) / 10)+150);
    }
}
