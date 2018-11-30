import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int i = 0;
        int n = scan.nextInt();

        for (i = 1; i <= n; i++) {

            double a = scan.nextDouble();
            double b = scan.nextDouble();
            double c = scan.nextDouble();

            double med = ((a * 2) + (b * 3) + (c * 5)) / 10;
            System.out.printf("%.1f%n", med);
        }

    }
}
