import java.util.Arrays;
import java.util.Scanner;

public class B10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        //N개의 정수 받기
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
//
//        int max = arr[0];
//        int min = arr[0];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (max < arr[i]) {
//                max = arr[i];
//            }
//            if (min > arr[i]) {
//                min = arr[i];
//            }
//        }
//        System.out.println(min+" "+max);

        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[N - 1]);
    }
}
