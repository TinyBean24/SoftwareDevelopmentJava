package Ch8;

import java.util.Scanner;

public class TestFile {
    public static void main(String[] args) {
        final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31};
        int month = 0, day= 0, Days = 0, totalDays = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        month = input.nextInt();

        System.out.print("Enter the day: ");
        day = input.nextInt();

        for (int i = 1; i < month; i++) {
            System.out.print(daysPerMonth[i] + " ");
            Days += daysPerMonth[i];
        }
        totalDays = Days + day;
        System.out.println("\n" + totalDays);
        System.out.println("\n" + totalDays);
    }
}