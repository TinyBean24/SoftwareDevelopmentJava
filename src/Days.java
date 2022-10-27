import java.util.Scanner;
public class Days {
    public static void main(String[] args) {

        int day= 0, year = 0, month = 0;
        getDays myDay = new getDays();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Year: ");
        year = input.nextInt();
        myDay.setYear(year);

        while (month > 12 || month <= 0 ) {
            System.out.print("Enter Month: ");
            if (myDay.getLeapYearMonths()) {

            }
            month = input.nextInt();
        }

        while (day >= 32 || day <= 0 ) {
            System.out.print("Enter day: ");
            if (!myDay.getLeapYearMonths() && day >= 29) {
                System.out.print("February only has 28 days on non leap years");
                continue;
            }
            if (myDay.getLeapYearMonths() && month == 2 && day >= 30) {
                System.out.print("February has 29 days on leap year: ");
                continue;
            }
            day = input.nextInt();
        }

        myDay.setMonth(month);
        myDay.setDay(day);
        myDay.setLeapYearMonths(year);

        System.out.printf("%s %d is day %d of %d", myDay.getMonth(), myDay.getDay(), myDay.getTotalDays(month, day), myDay.getYear());
    }
}