import java.util.Scanner;

public class DowhileExercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char answer = ' ';
        do {
            System.out.println("还钱吗?y/n");
            answer = sc.next().charAt(0);
            System.out.println("他的回答是:" + answer);

        } while (answer != 'y');
    }
}
