public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%d * %d = %d\t", (j + 1), (i + 1), (i + 1) * (j + 1));
            }
            System.out.println();
        }
    }
}
