public class TotalArrayValues {
    public static void main(String[] args) {
        int total = 0;

        int[][] a = new int[2][]; // create two rows
        a[0] = new int[5];  // create 5 columns for row 0
        a[1] = new int[3];  // creates 3 columns for row 1

        for (int row = 0; row < a.length; row++) {
            for (int column = 0; column < a[row].length; column++) {
                total += a[row][column];
            }
        }

//        for (int column = 0; column < a[0].length; column++) {
//            a[0][column] = 5;
//        }

        System.out.println(total);
    }
}
// The following nested for statement totals the values of all the elements in array a:


// Enhanced for loop
// for (int[] ints : a) {
//     for (int anInt : ints) {
//         total += anInt;
//     }
// }