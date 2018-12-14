import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 0;
        int j = 0;
        int z = 0;
        int d = 0;
        double sum = 0;
        double s = 0;
        double summa = 0;
        String name = scan.next();
        double[][] ar = new double[12][12];

        for (i = 0; i < ar.length; ++i) {
            for (j = 0; j < ar.length; ++j) {
                double num = scan.nextDouble();
                ar[i][j] = num;
                if (j > i) {
                    sum += ar[i][j];
                }
            }
        }

        if (name.equals("M")) {
            System.out.printf("%.1f%n", sum / 66.00);
        } else {
            System.out.printf("%.1f%n", sum);
        }
    }
}
