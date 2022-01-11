import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B1427 {
    public static void main(String[] args) {
        /*
        2143 -> 4321
        99899 -> 99998
        */

//        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> arrList = new ArrayList<>();
//
//        String str = sc.next();
//
//        for (int i = 0; i < str.length(); i++) {
//            arrList.add(str.charAt(i) - 48);
//        }
//
//        Collections.sort(arrList);
////        for (int i : arrList) {
////            System.out.println(i);
////        }
//
//        //역순 출력
//        //(자릿수(인덱스 번호); 0까지(인덱스 번호); 감소)
//        for (int i = str.length() - 1; i > -1; i--) {
//            System.out.print(arrList.get(i));
//
//
//        }
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        char[] str = num.toCharArray();     //문자열 > char형 배열

        Arrays.sort(str);
//        Arrays.sort(str, Collections.reverseOrder());
        for (int i = str.length - 1; i > -1; i--) {
            System.out.print(str[i]);
        }
    }
}
