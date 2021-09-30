import java.util.Scanner;

class Test {
    public long sum(int[] a) {
        long sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }
}
public class B15596 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Test test = new Test();

        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        test.sum(arr);
    }
}
