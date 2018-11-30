import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 0;
        int asum = 0;
        int gsum = 0;
        int dsum = 0;

        while (true) {

            int n = scan.nextInt();

            if (n == 4) {
                break;
            }
            if (n == 1) {
                asum += 1;
            }
            if (n == 2) {
                gsum += 1;
            }
            if (n == 3) {
                dsum += 1;
            }


        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + asum);
        System.out.println("Gasolina: " + gsum);
        System.out.println("Diesel: " + dsum);
    }
}
