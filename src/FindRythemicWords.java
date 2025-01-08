

/*
input - "google", "apple", "mapple", "sample", "doodle", "cat" ,"mat", "rat", "sex","ex"
output - google, apple, mapple, sample, doodle, cat, "mat", "rat", "ex","sex"
 */


import java.util.Arrays;

public class FindRythemicWords {

    public static void main(String[] args) {
        String[] input = new String[]{"google", "apple", "mapple", "sample", "doodle", "cat", "mat", "rat", "cex", "ex"};
        System.out.println("input:");
        for (String s : input) {
            System.out.print(" " + s);
        }
        /*
            Consider the strings as strings and reverse them and sort it so that
            once you reverse the strings you get the last characters of
            multiple strings comes together to form the rythamic words.
         */
        for (int i = 0; i < input.length; i++) {
            input[i] = reverseString(input[i]);
        }

        Arrays.sort(input);
        System.out.println("\noutput: ");
        for (int i = 0; i < input.length; i++) {
            input[i] = reverseString(input[i]);
            System.out.print(" " + input[i]);
        }

    }

    private static String reverseString(String s) {
        StringBuilder rev = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--)
            rev.append(s.charAt(i));
        return rev.toString();
    }

}
