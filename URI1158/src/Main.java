import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 0;
        int j = 0;
        int n = scan.nextInt();

        for (i = 1; i <= n; i++) {

            int x = scan.nextInt();
            int y = scan.nextInt();

            int sum = 0;
            if (x % 2 != 0) {

                for (j = x; j <= x + y + y - 1; j += 2) {
                    sum += j;
                }
            } else {
                for (j = x + 1; j <= x + y + y; j += 2) {
                    sum += j;
                }
            }
            System.out.println(sum);
        }
    }
}