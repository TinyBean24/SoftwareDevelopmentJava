package Ch8;
import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        int month, day, year;
        String[] months = {" ", "January", "February", "March",
                "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Month: ");
        month = input.nextInt();

        System.out.print("Enter Day: ");
        day = input.nextInt();

        System.out.print("Enter Year: ");
        year = input.nextInt();

        Date d1 = new Date(month, day, year);
        d1.nextDay();


//        System.out.printf("%n%s, is day <%d> of %d", d1.toString(), d1.totalDays(), year);
//        System.out.printf("%n%s %d, %d is day <%d> of %d", months[month], day, year, d1.totalDays(), year);
//        System.out.printf("%n%s %d, %d is day <%d> of %d", months[month], day, year, d1.totalDays(), year);
    }
}
