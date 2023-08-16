import java.util.Scanner;
public class pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入输出行数:");
        int totalLevel = sc.nextInt();
        for (int i = 1; i <= totalLevel; i++) {
            for (int k = 1; k <= totalLevel - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == totalLevel) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
