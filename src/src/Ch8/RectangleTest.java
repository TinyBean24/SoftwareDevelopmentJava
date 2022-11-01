package Ch8;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        // creating Rectangle class with default variables and printing
        Rectangle rect1 = new Rectangle();
        System.out.printf("Rectangle1 Information\nArea: %.2f\nPerimeter: %.2f\n",
                rect1.getArea(), rect1.getPerimeter());

        // Getting user input and assigning to variables
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter value between 0 and 20 for length: ");
        double l = input.nextDouble();

        System.out.print("Enter value between 0 and 20 for width: ");
        double w = input.nextDouble();
        // creating Rectangle 2 class. Passing l and w from user input
        Rectangle rect2 = new Rectangle(l, w);
        System.out.printf("\nRectangle2 Information\nArea: %.2f\nPerimeter: %.2f\n",
                rect2.getArea(), rect2.getPerimeter());

        // Changing Rectangle 1 informatmion using user input and the toString() method
        System.out.print("\nEnter value between 0 and 20 for length: ");
        rect1.setLength(input.nextDouble());
        System.out.print("\nEnter value between 0 and 20 for width: ");
        rect1.setWidth(input.nextDouble());

        System.out.printf("\nNew Rectangle1 Information for Rectangle1\n%s",rect1.toString());
    }
}
