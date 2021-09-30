import java.util.Scanner;

public class B4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int[] arr;

        for (int i = 0; i < C; i++) {
            int N = sc.nextInt();
            arr = new int[N];
            double sum = 0;
            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
                sum = sum + arr[j];
            }
            double avg = sum / N;
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > avg) {
                    count++;
                }
            }
            System.out.println(String.format("%.3f%",count/avg*100));
        }
    }
}
