import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int i = 0;
        int total = 0;
        int tCR = 0;
        int tRR = 0;
        int tSF = 0;

        float pC = (float) 0.00;
        float pR = (float) 0.00;
        float pS = (float) 0.00;


        for (i = 1; i <= n; i++) {

            int x = scan.nextInt();
            String l = scan.next();

            total += x;

            if (l.equals("C")) {
                tCR += x;
            } else if (l.equals("R")) {
                tRR += x;
            } else if (l.equals("S")) {
                tSF += x;


                pC = (float) (tCR * 100.00 / total);
                pR = (float) (tRR * 100.00 / total);
                pS = (float) (tSF * 100.00 / total);
            }


        }
        System.out.printf("Total: %d cobaias%n", total);
        System.out.println("Total de coelhos: " + tCR);
        System.out.println("Total de ratos: " + tRR);
        System.out.println("Total de sapos: " + tSF);
        System.out.printf("Percentual de coelhos: %.2f", pC);
        System.out.print(" %\n");
        System.out.printf("Percentual de ratos: %.2f", pR);
        System.out.print(" %\n");
        System.out.printf("Percentual de sapos: %.2f", pS);
        System.out.print(" %\n");
    }
}
