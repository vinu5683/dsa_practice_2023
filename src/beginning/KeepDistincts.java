package beginning;

import java.util.HashSet;
import java.util.Scanner;

public class KeepDistincts {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        HashSet<Character> hash = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!hash.contains(ch)) {
                System.out.print(ch);
                hash.add(ch);
            }
        }
    }
}
