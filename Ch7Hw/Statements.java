package Ch7Hw;

import java.util.Arrays;
import java.util.Collections;

public class Statements {
    public static void main(String[] args) {
        System.out.println();
        // A) Display the value of element 6 of array f.
        int[] f = {0,1,2,3,4,5,6,7,8,9};
        System.out.printf("The sixth element of array 'f' is: %d", f[6]);


        System.out.println();
        System.out.println();


        // B) Initialize each of the five elements of one-dimensional integer array g to 8.
        int[] g = {8, 8, 8, 8, 8};
        System.out.println("\nThe five elements of an integer one-dimensional array are: ");
        for (int i = 0; i < g.length; i++) {
            System.out.println("g[" + i + "]:" + g[i]);
        }


        System.out.println();
        System.out.println();


        // C) Total the 100 elements of floating-point array c.
        // method for sum of elements in array
        // Declaration
        int[] c = new int[100];

        // adding elements in the array
        for (int i = 0; i < c.length; i++) {
            c[i] = i + 1;
        }

        double sum = 0;

        // Iterate through all elements and add to the add variable
        for (int j : c) {
            sum += j;
        }
        System.out.printf("The total of the %d elements of floating point array c is: %.2f", c.length, sum);


        System.out.println();
        System.out.println();


        // D) Copy 11-element array 'a' into the first portion of array 'b', which contains 34 elements.
        System.out.println("Copy 11-element array 'a' into the first portion of array 'b', which contains 34 elements.");

        System.out.println();
        System.out.println();


        // E) Determine and display the smallest and largest values contained in 99-element floating-point array w.
        double[] w = new double[100-1];
        double smallest = w[1];
        double largest = w[0];

        // adding elements in the array
        for (int i = 1; i < w.length; i++) {
            w[i] = i + 1;
        }

        // Find the largest and smallest
        for (int i = 0; i < w.length; i++) {
            if (w[i] > largest)
                largest = w[i];
            else if (w[i] < smallest)
                smallest = w[i];
        }

        System.out.printf("The smallest value is: %.2f\n", smallest);
        System.out.printf("The largest value is: %.2f", largest);


    }
}