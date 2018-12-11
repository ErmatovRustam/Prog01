import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int i = 0;
        int anos = 0;

        for (i = 1; i <= n; i++) {
            int pA = scan.nextInt();
            int pB = scan.nextInt();
            double gA = scan.nextDouble();
            double gB = scan.nextDouble();

            for (i = pA; i < 100; i++) {
                if (pA > pB) {
                    anos = (i + 1);
                    break;
                }
                pA += (1 + pA * gA / 100);
                pB += (1 + pB * gB / 100);
            }

        }
        if (anos > 100) {
            System.out.println("Mais de 1 seculo.");
        } else {
            System.out.println(anos + " anos.");
        }
    }
}
