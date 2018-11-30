import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int i = 0;
        int sum = 0;
        int j = 0;

        for (i = 1; i <= n; i++) {
            sum = 0;
            int a = scan.nextInt();
            int b = scan.nextInt();

            if (a > b) {
                for (j = a - 1; j > b; j--) {
                    if (j % 2 != 0) {
                        sum += j;
                    }
                }
            } else if (a < b) {
                for (j = a + 1; j < b; j++) {
                    if (j % 2 != 0) {
                        sum += j;
                    }
                }
            } else {
                sum = 0;
            }
            System.out.println(sum);


        }
    }
}
