import java.util.Scanner;

public class B11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String arr = sc.next();
        int sum = 0;

        for (int i = 0; i < arr.length(); i++) {
            sum = sum + arr.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}

