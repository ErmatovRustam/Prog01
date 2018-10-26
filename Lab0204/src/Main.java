import java.util.*;

public class Main {

    public static void main(String[] args) {
        final double CM_PER_INCH = 2.54;
        // constant synonym for final

        Scanner scan = new Scanner(System.in);
        System.out.print("Length in inches? ");
        double inches = scan.nextDouble();

        double cm = CM_PER_INCH * inches;

        System.out.printf("%.2f in. = %.2f%n", inches, cm);


    }
}
