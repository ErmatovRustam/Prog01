import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        if ((a == 0) || (b * b - 4 * a * c < 0)) {
            System.out.println("Impossivel calcular");
        } else {
            double d = Math.sqrt((b * b) - (4.0 * a * c));
            double r1 = ((-b + d )/ (2.0 * a));
            double r2 = ((-b - d )/ (2.0 * a));

            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);

        }


    }
}
