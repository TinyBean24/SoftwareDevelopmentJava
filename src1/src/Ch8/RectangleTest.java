package Ch8;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        // creating Rectangle class with default variables and printing
        Rectangle rect1 = new Rectangle();
//        System.out.printf("Rectangle1 Information\nArea: %.2f\nPerimeter: %.2f\n",
//                rect1.getArea(), rect1.getPerimeter());
        int counter = 0;
        while (counter != 1) {
            Scanner input1 = new Scanner(System.in);
            System.out.print("1. Set Length\n2. Set Width\n3: Exit\nChoice: ");
            int choice = input1.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Length: ");
                    rect1.setLength(input1.nextDouble());
                    System.out.printf("Length: %02f\nWidth: %02f\nPerimeter: %02f\nArea: %02f"
                            , rect1.getLength(), rect1.getWidth()
                            , rect1.getPerimeter(), rect1.getArea());
                    break;

                case 2:
                    System.out.print("Enter Width: ");
                    rect1.setWidth(input1.nextDouble());
                    System.out.printf("Length: %02f\nWidth: %02f\nPerimeter: %02f\nArea: %02f"
                            , rect1.getLength(), rect1.getWidth()
                            , rect1.getPerimeter(), rect1.getArea());
                    break;
                default:
                    counter = 1;
                    break;
            }
        }
    }
}

//        // Getting user input and assigning to variables
//        Scanner input = new Scanner(System.in);
//        System.out.print("\nEnter value between 0 and 20 for length: ");
//        double l = input.nextDouble();
//
//        System.out.print("Enter value between 0 and 20 for width: ");
//        double w = input.nextDouble();
//        // creating Rectangle 2 class. Passing l and w from user input
//        Rectangle rect2 = new Rectangle(l, w);
//        System.out.printf("\nRectangle2 Information\nArea: %.2f\nPerimeter: %.2f\n",
//                rect2.getArea(), rect2.getPerimeter());
//
//        // Changing Rectangle 1 informatmion using user input and the toString() method
//        System.out.print("\nEnter value between 0 and 20 for length: ");
//        rect1.setLength(input.nextDouble());
//        System.out.print("Enter value between 0 and 20 for width: ");
//        rect1.setWidth(input.nextDouble());

//        System.out.printf("\nNew Rectangle1 Information for Rectangle1\n%s",rect1.toString());
//    }
//}
