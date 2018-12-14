import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] n = new double[100];
        double a = scan.nextDouble();
        int i = 0;

        for (i = 0; i <100; i++){
            n[i] = a;
            a /= 2;

            System.out.print("N[" + i + "] = ");
            System.out.printf("%.4f\n", n[i]);
        }


    }
}
