//// Exercise 5.16 Solutions: Graphs.jaa
//// Program prints 5 histograms with lengths determined by user input
//import java.util.Scanner;
//
//public class Graphs {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter number: ");
//        int num1 = input.nextInt(); // second number
//        System.out.print("Enter number: ");
//        int num2 = input.nextInt(); // second number
//        System.out.print("Enter number: ");
//        int num3 = input.nextInt(); // third number
//        System.out.print("Enter number: ");
//        int num4 = input.nextInt(); // fourth number
//        System.out.print("Enter number: ");
//        int num5 = input.nextInt(); // fifth number
//
//        int value = 0;  // number of stars to print
//
//        // print histograms
//        for ( int counter = 1; counter <= 5; counter++ )
//        {
//            switch ( counter ) {
//                case 1:
//                    value = num1;
//                    break;
//                case 2:
//                    value = num2;
//                    break;
//                case 3:
//                    value = num3;
//                    break;
//                case 4:
//                    value = num4;
//                    break;
//                case 5:
//                    value = num5;
//                    break;
//            } // end switch
//
//            for ( int j = 1; j <= value; j++ ) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }
//    }
//}