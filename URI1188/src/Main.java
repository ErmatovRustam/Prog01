import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 0;
        int j = 0;
        double sum = 0;
        double[][] ar = new double[12][12];
        int bj = 5;
        int ej = 6;
        int counter = 0;
        String name = scan.next();

        for (i = 0; i < ar.length; i++) {
            for (j = 0; j < ar.length; j++) {
                ar[i][j] = scan.nextDouble();
            }
        }


        for (i = 7; i <= 11; ++i) {
            for (j = bj; j <= ej; j++) {

                sum += ar[i][j];
                counter++;
            }
            bj--;
            ej++;
        }

        if (name.equals("M")) {
            System.out.printf("%.1f%n", sum / counter);
        } else {
            System.out.printf("%.1f%n", sum );
        }
    }
}
