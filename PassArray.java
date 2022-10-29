//// Fig. 7.13: PassArray.java
//// Passing entire arrays and individual array elements to a method
//
//import org.jetbrains.annotations.NotNull;
//
//public class PassArray {
//    // main creates array and calls modifyArray and modifyElement
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5};
//
//        System.out.printf(
//                "Effects of passing reference to entire array:%n" +
//                "The values of the original array are:%n");
//
//        // output original array elements (enhanced for statement)
//        for (int value : array) {
//            System.out.printf(" %d", value);
//        }
//
//        modifyArray(array); // pass array reference
//        System.out.printf("%n%nThe values of the modified array are:%n");
//
//        // output modify array elements
//        for (int value : array) {
//            System.out.printf(" %d", value);
//        }
//
//        System.out.printf(
//                "%n%nEffects of passing array element value:%n" +
//                "array[3] before modifyElement: %d%n", array[3]);
//
//        modifyElement(array[3]);  // attempt to modify array[3]
//        System.out.printf(
//                "array[3] after modifyElement: %d%n", array[3]);
//    }
//
//    // multiply each element of an array by 2
//    public static void modifyArray(int @NotNull [] array2) {
//        for (int counter = 0; counter < array2.length; counter++) {
//            array2[counter] *= 2;
//        }
//    }
//
//        // multiply arguement by 2
//        public static void modifyElement(int element) {
//        element *= 2;
//        System.out.printf(
//                "Value of element in modifyElement: %d%n", element);
//
//    }
//}
//
//
///**
// *
//
// // Java program to demonstrate
// // passing of array to method
//
// public class Test {
// // Driver method
// public static void main(String args[])
// {
// int arr[] = { 3, 1, 2, 5, 4 };
//
// // passing array to method m1
// sum(arr);
// }
//
// public static void sum(int[] arr)
// {
// // getting sum of array values
// int sum = 0;
//
// for (int i = 0; i < arr.length; i++)
// sum += arr[i];
//
// System.out.println("sum of array values : " + sum);
// }
// }
// */