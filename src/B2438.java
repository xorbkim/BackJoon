import java.util.Scanner;

public class B2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < i + 1; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
