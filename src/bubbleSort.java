public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {21, 69, 80, 57, 13};
        int temp = 0;//用于辅助交换的变量

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
