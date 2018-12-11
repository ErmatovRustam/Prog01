import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int n = scan.nextInt();
        if (n > 0) {
            int i = 0;
            int t;
            int sum = 0;
            for (i = a; i <= a + n - 1; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}