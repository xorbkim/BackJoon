import java.util.Arrays;
import java.util.Scanner;

public class B11651 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] arr = new int[N][2];    //(x, y)

        for (int i = 0; i < N; i++) {
            arr[i][1] = sc.nextInt();
            arr[i][0] = sc.nextInt();
        }

        Arrays.sort(arr, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            } else {
                return o1[0] - o2[0];
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arr[i][1] + " " + arr[i][0]).append('\n');
        }

        System.out.println(sb);


    }
}
