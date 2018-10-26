import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x1 = 4.00;
        double x2 = 4.50;
        double x3 = 5.00;
        double x4 = 2.00;
        double x5 = 1.50;

        int code = scan.nextInt();
        int quant = scan.nextInt();

        if (code == 1)
        {
            System.out.printf("Total: R$ %.2f\n",(quant * x1));
        }
        else if (code ==2)
        {
            System.out.printf("Total: R$ %.2f\n",(quant *x2));
        }
        else if (code ==3)
        {
            System.out.printf("Total: R$ %.2f\n",(quant *x3));
        }
        else if (code ==4)
        {
            System.out.printf("Total: R$ %.2f\n",(quant *x4));
        }
        else if (code ==5)
        {
            System.out.printf("Total: R$ %.2f\n",(quant *x5));
        }

    }
}
