import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = 0;
        int i = 0;

        if (a <= b) {
            for (i = a + 1; i < b; i++) {
                if (i % 2 == 1 || i % 2 == -1) {
                    sum += i;
                }

            }
        }
        if (a >= b) {
            for (i = b + 1; i < a; i++) {
                if (i % 2 == 1 || i % 2 == -1) {
                    sum += i;
                }

            }
        }
        System.out.println(sum);
    }
}
