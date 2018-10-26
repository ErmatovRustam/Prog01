import java.util.*;

public class MainWithoutFunctions {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double input = scan.nextDouble();
        int hundred = (int) (input / 100);
        int fifty = (int) (input % 100) / 50;
        int twenty = (int) (input % 100 % 50) / 20;
        int ten = (int) (input % 100 % 50 % 20) / 10;
        int five = (int) (input % 100 % 50 % 20 % 10) / 5;
        int two = (int) (input % 100 % 50 % 20 % 10 % 5) / 2;

        int one = (int) (input % 100 % 50 % 20 % 10 % 5 % 2);
        //double cents = (input - (hundred * 100.00 + fifty * 50.00 + twenty * 20 + ten * 10 + five * 5 + two * 2 + one));
        double cents = (input * 100) % 100;
        int fiftyCents = (int) (cents / 50);
        int quarterCents = (int) ((cents % 50) / 25);
        int tenCents = (int) ((cents % 50 % 25) / 10);
        int fiveCents = (int) ((cents % 50 % 25 % 10) / 5);
        int oneCent = (int) ((cents % 50 % 25 % 10 % 5) / 1);


        System.out.println("NOTAS:");
        System.out.println(hundred + " nota(s) de R$ 100.00");
        System.out.println(fifty + " nota(s) de R$ 50.00");
        System.out.println(twenty + " nota(s) de R$ 20.00");
        System.out.println(ten + " nota(s) de R$ 10.00");
        System.out.println(five + " nota(s) de R$ 5.00");
        System.out.println(two + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(one + " moeda(s) de R$ 1.00");
        System.out.println(fiftyCents + " moeda(s) de R$ 0.50");
        System.out.println(quarterCents + " moeda(s) de R$ 0.25");
        System.out.println(tenCents + " moeda(s) de R$ 0.10");
        System.out.println(fiveCents + " moeda(s) de R$ 0.05");
        System.out.println(oneCent + " moeda(s) de R$ 0.01");


    }
}
