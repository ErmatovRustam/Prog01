import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 0;
        int j = 0;
        double sum = 0;
        String name = scan.next();
        double[][] ar = new double[12][12];
        int bj = 1;
        int ej = 11;
        int z =0;
        int counter = 0;

        for (i = 0; i < ar.length; ++i) {
            for (j = 0; j < ar.length; ++j) {
                double n = scan.nextDouble();
                ar[i][j] = n;

            }
        }


        for(i=0; i<5; i++){
            for(j=bj; j<ej; j++){

                sum += ar[i][j];
                counter++;
            }
            bj++;
            ej--;
        }
        if (name.equals("M")) {
            System.out.printf("%.1f%n", sum / counter);
        } else {
            System.out.printf("%.1f%n", sum );
        }
    }
}
