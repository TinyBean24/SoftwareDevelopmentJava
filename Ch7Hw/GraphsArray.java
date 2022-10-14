import java.util.Scanner;

public class GraphsArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number: ");
            numbers[i] = input.nextInt();  // first number
        }
        // print histograms
        // a
        for (int counter = 0; counter < 5; counter++) {
            //b
            for (int j = 1; j <= numbers[counter]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
