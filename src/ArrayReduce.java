import java.util.Scanner;

public class ArrayReduce {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        while (true) {
            System.out.println("whethertoreduce y/n");
            char key = sc.next().charAt(0);
            if (key == 'n') {
                break;
            } else if (arr.length == 1) {
                System.out.println("不能在缩减");
                break;
            }
            int[] newarr = new int[arr.length - 1];
            for (int i = 0; i < arr.length - 1; i++) {
                newarr[i] = arr[i];
            }
            arr = newarr;
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

        }


    }
}
