import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int i = 0;
        int j = 0;
        int sum = 0;

        for (i = 1; i <= n; i++) {

            int pn = scan.nextInt();
            boolean isPrime = true;

            for (j = 2; j < pn; j++) {

                if (pn % j == 0) {
                    isPrime = false;
                }

            }
            if (isPrime) {
                System.out.printf(pn + " eh primo%n");
            } else {
                System.out.printf(pn + " nao eh primo%n");
            }

        }
    }
}
