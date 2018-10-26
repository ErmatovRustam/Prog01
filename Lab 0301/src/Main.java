import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("some real number? ");
        double a = scan.nextDouble();
        double r = a;

        if (a < 0){
            r = -r;
        }

            System.out.printf("|%.1f| = %.1f", a, r);

    }
}
