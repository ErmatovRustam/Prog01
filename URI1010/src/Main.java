import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int code = scan.nextInt();
        int nUnit = scan.nextInt();
        double price = scan.nextDouble();
        int codeB = scan.nextInt();
        int nUnitB = scan.nextInt();
        double priceB = scan.nextDouble();
        double c = (nUnit * price) + (nUnitB * priceB);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", c);


    }
}
