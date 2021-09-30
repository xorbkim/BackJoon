import java.util.Scanner;

public class B2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int mul = A * B * C;

        //곱한 값 배열로 저장
        String num = Integer.toString(mul);
//        String num = String.valueOf(mul);

        String arr[] = num.split("");

        for (int i = 0; i < 10; i++) { //0~9까지 수 탐색
            int count = 0;
            for (int j = 0; j < num.length(); j++) {
                if ((num.charAt(j) - '0') == i) {
                    count++;
                }
            }
            System.out.println(count);

        }



    }
}
