import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {   //단어 길이가 같으면
                    return o1.compareTo(o2);        //사전대로
                } else {
                    return o1.length() - o2.length();
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append('\n');

        for (int i = 0; i < N; i++) {
            if (!arr[i].equals(arr[i - 1])) {   //중복되지 않으면 출력
                sb.append(arr[i]).append('\n');
            }
        }
        System.out.println(sb);
    }
}
