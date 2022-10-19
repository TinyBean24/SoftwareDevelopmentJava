import java.util.ArrayList;
import java.util.Arrays;

public class AddElementToAnArray {
    public static void main(String[] args) {
        // Options to add an array include
        /**
         *  1. Create NEW array
         *  2. Use ArrayList as intermediate storage
         *  3. Shifting the elements to adjust the size of the Array
         */
        // 1. Creating a NEW Larger Array
        int array1[] = {11,22,33,44,55};
        int arr = array1.length;
        int newArray1[] = new int[arr + 1];
        int num = 66;
        System.out.println(Arrays.toString(array1));
        for (int i = 0; i < arr; i++) {
            newArray1[i] = array1[i];
        }
        newArray1[arr] = num;
        System.out.println(Arrays.toString(newArray1));


        System.out.println();
        System.out.println();


        // 2. Using ArrayList
        Integer array2[] = {1,2,3,4,5,6};
        System.out.println("Array: " + Arrays.toString(array2));
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(array2));
        arrayList.add(7);
        array2 = arrayList.toArray(array2);
        System.out.println("Array after adding element: " + Arrays.toString(array2));


        System.out.println();
        System.out.println();


        // Shifting Elements to Adjust the size of the Array
        /**
         *  1. Create a new destination array with larger size than original array
         *  2. Copy all elements from the original array to the new destination array
         *  3. Shift the elements after the given index to the right until it reaches the end of the array
         *  4. Insert the new element at the given index
         */
        int arr2[] = {6,7,8,9,10};
        int n = arr2.length;
        int index = 5;
        System.out.println("Original Array: " + Arrays.toString(arr2));
        Integer newArr2[] = new Integer[n + 1];
        int j = 0;

        for (int i = 0; i < newArr2.length; i++) {
            if (i == index) {
                newArr2[i] = 11;
            }
            else {
                newArr2[i] = arr2[j];
                j++;
            }
        }
        newArr2[index] = 11;

        System.out.println("Array after adding value: " + Arrays.toString(newArr2));
    }
}
