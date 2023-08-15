public class WhileExercise {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        while (num <= 100) {
            if (num % 3 == 0) {
                System.out.println(num);
                sum+=num;
            }
            num++;
        }
        System.out.println(sum);
    }
}

