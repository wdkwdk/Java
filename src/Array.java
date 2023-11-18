import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //初始数组
        int[] arr = {1, 2, 3};

        do {
            //定义新数组,比原数组大1
            int[] arrNew = new int[arr.length + 1];
            //将初始数组数据复制到新数组
            for (int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];
            }
            System.out.println("请输入要添加的元素");
            int addNum = sc.nextInt();
            //将用户输入的元素添加到数组最后
            arrNew[arrNew.length - 1] = addNum;
            //扩容后的数组指向初始数组
            arr = arrNew;
            //输出扩容后数组
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + "\t");
            }
            System.out.println("是否继续添加 y/n");
            char key = sc.next().charAt(0);
            if (key == 'n') {
                break;
            }
        } while (true);
        System.out.printf("你退出了添加");
    }
}
