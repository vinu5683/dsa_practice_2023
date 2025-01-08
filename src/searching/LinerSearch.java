package searching;

public class LinerSearch {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 5, 6, 3, 6, 3, 433, 4, 66, 2, 11, 5450, 3, 3455, 32, 34, 56, 33};
        int key = 32;

        for (int j : arr) {
            if (key == j) {
                System.out.println("YEY Found");
                return;
            }
        }

        System.out.println("Nah... Not Found");
    }
}
