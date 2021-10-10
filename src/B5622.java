import java.util.Scanner;

public class B5622 {
    public static void main(String[] args) {
        //입력으로 알파벳 대문자, 그 마다 의미하는 숫자
        //A, B, C = 2,  2를 걸라면 3초 소요
        //A,B,C = 3초+
        //D,E,F = 4초+
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // 알파벳 대문자 입력
        int time = 0; // 출력할 시간 변수 선언, 초기화
        char tmp; // 임시변수

        for (int i = 0; i < str.length(); i++) { // 문자길이만큼 반복
            tmp = str.charAt(i); // 알파벳 자리바다 비교
            if (tmp >= 'A' && tmp <= 'C') {
                time = time + 3;
            } else if (tmp >= 'D' && tmp <= 'F') {
                time = time + 4;
            }else if (tmp >= 'G' && tmp <= 'I') {
                time = time + 5;
            }else if (tmp >= 'J' && tmp <= 'L') {
                time = time + 6;
            }else if (tmp >= 'M' && tmp <= 'O') {
                time = time + 7;
            }else if (tmp >= 'P' && tmp <= 'S') {
                time = time + 8;
            }else if (tmp >= 'T' && tmp <= 'V') {
                time = time + 9;
            }else if (tmp >= 'W' && tmp <= 'Z') {
                time = time + 10;
            }
            System.out.println(time);
        }
    }
}

//public class B5622 {
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//
//        String s = in.nextLine();
//
//        int count = 0;
//        int k = s.length();
//
//        for(int i = 0; i < k; i++) {
//
//            switch(s.charAt(i)) {
//
//                case 'A' : case 'B': case 'C' :
//                    count += 3;
//                    break;
//
//                case 'D' : case 'E': case 'F' :
//                    count += 4;
//                    break;
//
//                case 'G' : case 'H': case 'I' :
//                    count += 5;
//                    break;
//
//                case 'J' : case 'K': case 'L' :
//                    count += 6;
//                    break;
//
//                case 'M' : case 'N': case 'O' :
//                    count += 7;
//                    break;
//
//                case 'P' : case 'Q': case 'R' : case 'S' :
//                    count += 8;
//                    break;
//
//                case 'T' : case 'U': case 'V' :
//                    count += 9;
//                    break;
//
//                case 'W' : case 'X': case 'Y' : case 'Z' :
//                    count += 10;
//                    break;
//            }
//        }
//        System.out.print(count);
//    }
//}