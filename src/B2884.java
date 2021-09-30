import java.util.Scanner;

public class B2884 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();

        if (min < 45) {
            hour--;
            min = 60 - (45 - min);
            if (hour < 0) {
                hour = 23;
            }
            System.out.println(hour+""+min);

        } else {
            min = min - 45;
            System.out.println(hour+""+min);
        }


    }
}
