import java.util.Scanner;
public class Days {
    public static void main(String[] args) {

        int day= 0, year = 0, month = 0;

        Scanner input = new Scanner(System.in);
        while (month > 12 || month <= 0 ) {
            System.out.print("Enter Month: ");
            month = input.nextInt();
        }

        while (day >= 32 || day <= 0 ) {
            System.out.print("Enter day: ");
            day = input.nextInt();
        }

        System.out.print("Enter Year: ");
        year = input.nextInt();

        getDays myDay = new getDays();
        myDay.setMonth(month);
        myDay.setDay(day);
        myDay.setYear(year);
        myDay.setLeapYear(year);

        System.out.printf("%s %d is day %d of %d", myDay.getMonth(), myDay.getDay(), myDay.getTotalDays(month, day), myDay.getYear());
    }
}