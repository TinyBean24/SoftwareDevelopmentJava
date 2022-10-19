package Ch7Hw;
import java.util.Scanner;

public class Fibonacci {
    private static long[] fibonacciCache;

    private static long fibonacci(int n) {
        if (n <= 1) {
            return n;
    }

    if (fibonacciCache[n] != 0) {
        return fibonacciCache[n];
    }

    long nthFibonacciNumber = (fibonacci(n - 1) + fibonacci(n - 2));
    fibonacciCache[n] = nthFibonacciNumber;

    return nthFibonacciNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();

        fibonacciCache = new long[n + 1];

        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}



/**
 * f(n) = f(n - 1) + f(n - 2)
 */