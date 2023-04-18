package beginning;

import java.util.Scanner;

public class DecodeMessage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int maxCount = 1;
        int count = 0;
        char lastChar = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == lastChar) {
                count++;
                if (count > maxCount)
                    maxCount = count;
            } else {
                count = 1;
            }
            lastChar = str.charAt(i);
        }
        System.out.println(maxCount);
    }
}
