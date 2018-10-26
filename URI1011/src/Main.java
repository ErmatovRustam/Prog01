import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double PI = 3.14159;
        int r = scan.nextInt();
        double v = (4 / 3.0) * PI * r * r * r;
        System.out.printf("VOLUME = %.3f\n", v);


    }
}
