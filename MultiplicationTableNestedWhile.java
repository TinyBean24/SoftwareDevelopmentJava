public class MultiplicationTableNestedWhile {
    public static void main(String[] args) {
        System.out.println("Multiplication Table");
        int i = 1;
        while (i <= 10){
            int j = 1;
            while (j <=10){
                System.out.print(i*j+"\t");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
