package beginning;

import java.util.Scanner;

public class LeaderBoard {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        int[] marks = new int[n];
        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            String[] str = s.nextLine().split(" ");
            names[i] = str[0];
            marks[i] = Integer.parseInt(str[1]);
        }

        // sort based on marks
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] <= marks[j + 1]) {
                    swapTheNamesMarks(marks, names, j, j + 1);
                }
            }
        }
        int rank = 0;
        int lastMark = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (lastMark != marks[i]) {
                lastMark = marks[i];
            } else {
                traverseToRank(marks, names, i - 1, rank + 1);
            }
        }
        lastMark = Integer.MIN_VALUE;
        int lastRank = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (lastMark != marks[i]) {
                lastMark = marks[i];
                marks[i] = ++rank;
                lastRank = rank;
            } else {
                marks[i] = lastRank;
                ++rank;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(marks[i] + " " + names[i]);
        }
    }

    private static int traverseToRank(int[] marks, String[] names, int index, int rank) {
        int count = 0;
        for (int i = index; i < marks.length; i++) {
            if (marks[i] == marks[index]) {
                count++;
            }
        }

        //sorting out the names
        for (int i = index; i <= index + count; i++) {
            for (int j = index; j < index + count - 1; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    String str = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = str;
                }
            }
        }
        return count;
    }

    private static void swapTheNamesMarks(int[] marks, String[] names, int i, int j) {
        int temp = marks[i];
        marks[i] = marks[j];
        marks[j] = temp;
        String str = names[i];
        names[i] = names[j];
        names[j] = str;
    }

}
