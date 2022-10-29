package Ch8;
import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        int month, day, year;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Month: ");
        month = input.nextInt();

        System.out.print("Enter Day: ");
        day = input.nextInt();

        System.out.print("Enter Year: ");
        year = input.nextInt();

        Date d1 = new Date(month, day, year);
        System.out.println(d1);
    }
}
