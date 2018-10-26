import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Temperature in degrees Fahrenheit? ");
        double tF = scan.nextDouble();

        double tC = 5.0 / 9.0 * (tF - 32);
        // best way to add 5.00 to make double
        // without .00 answer will be 0. because int / int wont be double


        // gp


        System.out.printf("The temperature in degrees Celsius is %.2f%n", tC);
    }
}
