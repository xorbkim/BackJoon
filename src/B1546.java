import java.util.Scanner;

public class B1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }

        double M= 00;
        for (int i = 0; i < arr.length; i++) {
            if (M < arr[i]) {
                M = arr[i];
            }
        }

        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] / M * 100;
            sum = sum + arr[i];
        }
        System.out.println(sum/arr.length);

    }
}
