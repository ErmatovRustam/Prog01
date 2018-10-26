import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int hundred = n / 100;

        int fifty = (n - hundred * 100) / 50;
        int twenty = (n - (hundred * 100 + fifty * 50)) / 20;
        int ten = (n - (hundred * 100 + fifty * 50 + twenty * 20)) / 10;
        int five = (n - (hundred * 100 + fifty * 50 + twenty * 20 + ten * 10)) / 5;
        int two = (n - (hundred * 100 + fifty * 50 + twenty * 20 + ten * 10 + five * 5)) / 2;
        int one = (n - (hundred * 100 + fifty * 50 + twenty * 20 + ten * 10 + five * 5 + two * 2));

        System.out.println(n);
        System.out.println(hundred + " nota(s) de R$ 100,00");
        System.out.println(fifty + " nota(s) de R$ 50,00");
        System.out.println(twenty + " nota(s) de R$ 20,00");
        System.out.println(ten + " nota(s) de R$ 10,00");
        System.out.println(five + " nota(s) de R$ 5,00");
        System.out.println(two + " nota(s) de R$ 2,00");
        System.out.println(one + " nota(s) de R$ 1,00");


    }
}
