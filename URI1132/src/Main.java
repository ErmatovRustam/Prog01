import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int i = 0;
        int sum = 0;

        if (a < b) {
            for (i = a; i <= b; i++) {

                if (i % 13 != 0) {
                    sum += i;
                }
            }

        }
        if (b < a) {
            for (i = b; i <= a; i++) {

                if (i % 13 != 0) {
                    sum += i;
                }
            }

        }
        System.out.println(sum);

    }
}
