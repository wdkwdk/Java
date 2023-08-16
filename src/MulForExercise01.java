import java.util.Scanner;

public class MulForExercise01 {
    public static void main(String[] args) {
        int total = 0;
        int sum = 0;
        double count = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println("请输入第" + i + "个班第" + j + "个人的成绩");
                double score = sc.nextDouble();
                System.out.printf("第%d个班,第%d个人的成绩为:%.2f", (i), (j), (score));
                System.out.println();
                total += score;
                if (score >= 60) {
                    count++;
                }
            }
            System.out.printf("第%d个班总分为:%d分", (i), (total));
            System.out.println();
            System.out.printf("第%d个班平均数为:%d分", (i), (total / 5));
            System.out.println();
            System.out.printf("第%d个班及格人数为%d人", (i), (int)(count));
            System.out.println();
            System.out.printf("第%d个班及格率为:%.2f%%", (i), (count/5 * 100));


            sum += total;

        }
        System.out.println("三个班的平均分为:" + sum / 3);
    }
}
