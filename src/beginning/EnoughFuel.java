package beginning;

import java.util.Scanner;

public class EnoughFuel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int fuelPrice = s.nextInt();
        int distanceToCover = s.nextInt();
        if ((distanceToCover*fuelPrice)>50) System.out.println("Enough");
        else System.out.println("Go On");
    }
}
