import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numColum = scan.nextInt();
        String oper = scan.next();

        int i = 0;
        int j = 0;
        int z = 0;
        double sum=0 ;
        double n;

        double[][] ar = new double[12][12];

        for (i = 0; i < ar.length; ++i) {
            for (j = 0; j < ar.length; ++j) {
                n = scan.nextDouble();
                ar[i][j] = n;
            }
        }

        for (z = 0; z < ar[numColum].length; ++z) {
            sum += ar[z][numColum];

        }
        if (oper.equals("M")) {
            System.out.printf("%.1f%n", sum / 12.00);
        } else {
            System.out.printf("%.1f%n", sum);
        }


    }
}
