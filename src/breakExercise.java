import java.util.Scanner;
public class breakExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1-100以内的数求和,求出当和第一次大于20的当前数
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            sum += i;
//            if (sum >= 20) {
//                System.out.println(i);
//                break;
//            }
//            System.out.println(sum);
//            }
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入用户名");
            String username = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();
            if (username.equals("丁真") && password.equals("666")) {
                System.out.println("登录成功");
                break;
            } else {
                System.out.println("登录失败,剩余:" + (3 - i) + "次机会");
            }
        }

    }

}

