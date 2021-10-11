import java.util.Scanner;

public class B10870 {
    public static void main(String[] args) {
//        n1 = 0
//        n2 = 1
//        n3 = n1 + n2 = 1
//        n4 = n3 + n2 = 2
//        F(n) = F(n-1) + F(n-2)
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(fibonacci(N));

    }

    public static int fibonacci(int N) {
        if (N == 0) {
            return 0;
        } else if (N == 1) {
            return 1;
        }
        return fibonacci(N - 1) + fibonacci(N - 2);
    }
}
