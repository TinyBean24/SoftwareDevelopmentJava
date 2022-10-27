import java.util.Scanner;
public class Days {
    public static void main(String[] args) {

        int day= 0, year = 0, choice = 0;
        int month = 0;

        Scanner input = new Scanner(System.in);
        while (choice > 12 || choice <= 0 ) {
            System.out.print("Enter Month: ");
            choice = input.nextInt();
        }

        while (day >= 32 || day <= 0 ) {
            System.out.print("Enter day: ");
            day = input.nextInt();
        }

        System.out.print("Enter Year: ");
        year = input.nextInt();

        getDays myDay = new getDays();
        myDay.setMonth(choice);
        myDay.setDay(day);
        myDay.setYear(year);



        System.out.printf("%s %d is day %d of %d", myDay.getMonth(), myDay.getDay(), myDay.getTotalDays(), myDay.getYear());
    }
}