import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        long j = 0;
        long i = 0;
        int m = scan.nextInt();
        long fab[] = new long[61];
        fab[0] = 0;
        fab[1] = 1;

        for (j = 0; j < m; j++) {

            int n = scan.nextInt();


            for (i = 2; i <= 60; i++) {
                fab[(int) i] = fab[(int) (i - 2)] + fab[(int) (i - 1)];

                if (n == 0) {
                    System.out.println("Fib(0) = 0");
                    break;
                }
                if (n == 1) {
                    System.out.println("Fib(1) = 1");
                    break;
                }
                if (i == n) {
                    System.out.println("Fib(" + i + ") = " + fab[(int)i]);
                }


            }
        }
    }
}