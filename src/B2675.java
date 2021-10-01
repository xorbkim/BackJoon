import java.util.Scanner;

public class B2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt(); // 몇 줄 입력받을지

        for (int i = 0; i < count; i++) { // count 만큼 반복
            int R = sc.nextInt(); // 각 문자 반복 횟수
            String S = sc.next(); // 문자열 입력
            for (int j = 0; j < S.length(); j++) { // 문자열 길이만큼 반복
                for (int k = 0; k < R; k++) { // 문자열 반복 횟수만큼 반복 -> 반복 출력
                    System.out.print(S.charAt(j)); // 문자열 반복 출력
                }
            }
            System.out.println();
        }


    }
}
