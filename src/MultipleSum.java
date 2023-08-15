import java.util.Scanner;

public class MultipleSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入起始数字");
        int start = sc.nextInt();
        System.out.println("请输入结束数字");
        int end = sc.nextInt();
        if (start>=end){
            System.out.println("请输入一个正确的范围");
        }else {
            System.out.println("请输入一个数");
            int multiple = sc.nextInt();
            int sum = 0;
            int count = 0;

            for (int i = start; i <= end; i++) {
                if (i % multiple == 0) {
                    System.out.println(i);
                    sum += i;
                    count++;
                }
            }
            System.out.println(start + "~" + end + "以内是"+multiple+"的倍数的数之和为:" + sum);
            System.out.println(start + "~" + end + "以内是"+multiple+"的倍数有:" + count + "个");
        }


    }
}

