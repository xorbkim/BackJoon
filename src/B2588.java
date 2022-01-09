import java.util.Scanner;

public class B2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String str = sc.next();

        System.out.println(num * (str.charAt(2) - '0'));
        System.out.println(num * (str.charAt(1) - '0'));
        System.out.println(num * (str.charAt(0) - '0'));
        System.out.println(num * Integer.parseInt(str));

    }
}
