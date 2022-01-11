import java.util.Scanner;

public class B2798 {
    public static void main(String[] args) {
        /*
        카드합 < 21, 카드합 Max
        카드>0
        딜러: N장의 카드를 숫자가 보이게, 숫자M을 외친다
        플레이어: N장의 카드중 3장의 카드를 고른다
                n1+n2+n3<M, M과 최대한 가깝게
        N장의 카드
        M을 넘지 않으면서
        M에 최대한 가까운 카드 3장의 합을 출력
        N에서 3개를 고르는 경우 탐색
        각 경우 카드합 < M (max)
       */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = Func(arr, N, M);
        System.out.println(sum);
    }

    static int Func(int[] arr, int N, int M) {
        int result =0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int temp = arr[i] + arr[j] + arr[k];

                    if (M == temp) {
                        return temp;
                    }
                    if (result < temp && temp < M) {
                        result = temp;
                    }
                }
            }
        }
        return result;
    }
}
