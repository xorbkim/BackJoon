import java.util.*;

public class B2751 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        ArrayList<Integer> arrList = new ArrayList<>(N);
//        for (int i = 0; i < arrList.size(); i++) {
//            int num = sc.nextInt();
//            arrList.add(num);
//        }
//        Collections.reverse(arrList);
//        for (int i : arrList) {
//            System.out.println(arrList.get(i));
//        }

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();

        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arrList.add(sc.nextInt());
        }

        Collections.sort(arrList);

        for (int i : arrList) {
            sb.append(i).append('\n');
        }
        System.out.println(sb);
    }
}
