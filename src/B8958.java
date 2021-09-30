import java.util.Scanner;

public class B8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < arr.length; i++) { //배열 순서
            int sum = 0; // 누적 합
            int cnt = 0; // 연속 횟수
            for (int j = 0; j < arr[i].length(); j++) { //배열 요소 분석
                if (arr[i].charAt(j) == 'O') {
                    cnt++;
                } else {
                    cnt = 0;
                }
                sum = sum + cnt;
            }
            System.out.println(sum);
        }

    }
}
