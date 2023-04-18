package beginning;

import java.util.Scanner;

public class TheAshes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aus = scanner.nextInt();
        int eng = scanner.nextInt();
        if (aus==eng) System.out.println("Tie");
        else if (aus>eng) System.out.println("Australia");
        else System.out.println("England");
    }
}
