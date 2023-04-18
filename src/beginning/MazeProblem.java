package beginning;

import java.util.Scanner;

public class MazeProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'L' -> x--;
                case 'R' -> x++;
                case 'U' -> y++;
                case 'D' -> y--;
            }
        }
        System.out.println(x + " " + y);
    }
}
