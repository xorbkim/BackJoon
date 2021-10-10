import java.util.Scanner;

public class B1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int count = 0;
            String str = sc.next();
            for (int j = 0; j < str.length()-1; j++) {
                if (str.charAt(j) == str.charAt(j + 1)) {
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
