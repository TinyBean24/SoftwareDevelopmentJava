//package Ch8.A_Template_Files;
//import java.util.Scanner;
//
//public class DateTest_original_template {
//    public static void main(String[] args) {
//        int month, day, year;
//        String[] months = {" ", "January", "February", "March",
//                "April", "May", "June", "July", "August",
//                "September", "October", "November", "December"};
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter Month: ");
//        month = input.nextInt();
//
//        System.out.print("Enter Day: ");
//        day = input.nextInt();
//
//        System.out.print("Enter Year: ");
//        year = input.nextInt();
//
//        Date_original_template d1 = new Date_original_template(month, day, year);
//
//        System.out.printf("%n%s, is day <%d> of %d", d1.toString(), d1.totalDays(), year);
//        System.out.printf("%n%s %d, %d is day <%d> of %d", months[month], day, year, d1.totalDays(), year);
//        System.out.printf("%n%s %d, %d is day <%d> of %d", months[month], day, year, d1.totalDays(), year);
//    }
//}
