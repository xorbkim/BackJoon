import java.util.Scanner;

public class B2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int C = (new Scanner(System.in).nextInt());
            // StringBuilder()
            // String과 문자열을 더할 때 기존의 데이터를 더하는방식
            // append() : 문자열을 더하는
            // toString() : 문자열 출력


        StringBuilder sb = new StringBuilder();

        A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
        B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());

        System.out.println(A > B ? A : B);
    }
}
