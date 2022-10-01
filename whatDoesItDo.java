public class whatDoesItDo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){            // Determines how many iterations
            for (int j = 1; j <= 3; j++) {       // Determines how many rows
                for (int k = 1; k <= 4; k++){    // Determines how many columns
                    System.out.print('*');       // Prints out number of asterisk
                }
                System.out.println();            // Prints newline after the last asterisk
            }
            System.out.println();                // Creates new line between the groups
        }
    }
}
