import java.util.Arrays;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        Integer[] arrayA = {6,7,8,9,10,12,32,44,35,44,
                8,9,10,12,32,44,35,44,66,11,
                21,23,34,45,56,67,78,87,76,99,
                0, 0, 0, 0};

        int min = Collections.min(Arrays.asList(arrayA));
        int max = Collections.max(Arrays.asList(arrayA));

        System.out.println("Minimum number " + min);
        System.out.println("Maximum number " + max);

//        int n = arrayA.length;
//        int index = 0;
//        System.out.println("Original Array: " + Arrays.toString(arrayA));
//        Integer arrayB[] = new Integer[n + 11];
//        int j = 0;
//
//        for (int i = 0; i < arrayB.length; i++) {
//            if (i == index) {
//                arrayB[i] = 11;
//
//            } else {
//                arrayB[i] = arrayA[j];
//                j++;
//            }
//        }
//        arrayB[index] = 11;
//
//        System.out.println("Array after adding value: " + Arrays.toString(arrayB));
    }
}





//public class Test {
//    public static void main(String[] args) {
//        int[] items = {0,2,4,6,8};
//        // regular for loop
//        for(int i = 0; i < items.length; i++)
//            System.out.printf("%d%n", items[i]);
//
//        // enhanced for loop
//        for(int i: items)
//            System.out.printf("%d%n",i);
//    }
//}





//public class Test
//{
//    public static void main(String[] args)
//    {
//        int[] a = {99, 22, 11, 3, 11, 55, 44, 88, 2, -3};
//
//        int result = 0;
//
//        for (int i = 0; i < a.length; i++)
//        {
//            if (a[i] > 30)
//                result += a[i];
//        }
//
//        System.out.printf("Result is: %d%n", result);
//    }
//}





//public class Test
//{
//    public static void main(String[] args)
//    {
//        int[] a;
//        a = new int[10];
//
//        for (int i = 0; i < a.length; i++)
//            a[i] = i + 2;
//
//        int result = 0;
//        for (int i = 0; i < a.length; i++)
//            result += a[i];
//
//        System.out.printf("Result is: %d%n", result);
//    }
//}