import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[][] array = new double[12][12];

        int line;
        line = scan.nextInt();
        String oper;
        oper = scan.next();

        int i = 0;
        int j = 0;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; ++j) {
                double n;
                n = scan.nextDouble();
                array[i][j] = n;
            }
        }

        double sum = 0;
        for (int p = 0; p < array[line].length; ++p) {
            sum += array[line][p];
        }

        if (oper.equals("M")) {
            System.out.printf("%.1f%n",sum / 12.00);
        } else {
            System.out.printf("%.1f%n",sum);
        }


    }
}
