import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();


        if (a >= b && b > c) {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
        if (a >= c && c > b) {
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        }
        if (b >= a && a > c) {
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        }
        if (b >= c && a < c) {
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        }

        if (c >= a && a > b) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);

        }
        if (c >= b && b > a) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);

        }

        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
