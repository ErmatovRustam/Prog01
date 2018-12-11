import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        double n = 0;
        double m = 0;


        while (n != 2.0) {

            double a = scan.nextDouble();


            if ((a >= 0.00) && (a <= 10.00)) {
                n += 1;
                m += a;

            } else {
                System.out.println("nota invalida");
            }

        }
        System.out.printf("media = %.2f%n", m / 2.0);
        System.out.println("novo calculo (1-sim 2-nao)");

        int o;

        while ((o = scan.nextInt()) !=2) {

            if (o == 1) {
                double s = 0;
                double d = 0;
                while (s != 2.0) {

                    double p = scan.nextDouble();


                    if ((p >= 0.00) && (p <= 10.00)) {
                        s += 1;
                        d += p;

                    } else {
                        System.out.println("nota invalida");
                    }
                }
                System.out.printf("media = %.2f%n", d / 2.0);
                System.out.println("novo calculo (1-sim 2-nao)");

            }else {
                System.out.println("novo calculo (1-sim 2-nao)");

            }
        }

    }
}
