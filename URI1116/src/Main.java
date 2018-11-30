import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        int i = 0;

        for (i = 1; i <= n; i++) {
            double x = scan.nextDouble();
            double y = scan.nextDouble();


            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                System.out.printf("%.1f%n", x / y);

            }
        }
    }
}