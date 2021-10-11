import java.util.Scanner;

public class B10872 {
    public static void main(String[] args) {
        // 5! = 5*4*3*2*1
        // n! = n*(n-1)*(n-2)* ... *2*1
        // 자신을 정의할 때 자기 자신을 재참조하는 방법: 재귀
        // 재귀가 깊어지면-> Stack OverFlow 에러 ->스택된 메모리 너무 많아짐->pop느려짐
        // 재귀함수가 끝나는 지점을 정확하게 구현 -> 무한루프 방지

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = factorial(N);
        System.out.println(sum);

//      ---------------------------
//        int sum2 = 1;
//        while (N != 0) {
//            sum2 = sum2 * N;
//            N--;
//        }
    }
    // N >= 13 -> long Type
    public static int factorial(int N) {
        if (N <= 1) {
            return 1; // 0! = 1
        }
        return N * factorial(N - 1);
    }
}
//        N = 6
//        6 * factorial(5){
//            5 * factorial(4);{
//                4 * factorial(3){
//                    3 * factorial(2){
//                        2 * factorial(1){
//                            return 1;
//                        }
//                        return 2 * 1;
//                    }
//                    return 3 * 2 * 1;
//                }
//                return 4 * 3 * 2 * 1;
//            }
//            return 5 * 4 * 3 * 2 * 1;
//        }
//        return 6 * 5 * 4 * 3 * 2 * 1;
//    }


