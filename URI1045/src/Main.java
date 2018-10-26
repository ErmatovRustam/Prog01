import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        double n3 = scan.nextDouble();

        double a = 0;
        double b = 0;
        double c = 0;

        if (n1 >= n2 && n2 >= n3) {
            a += n1;
            b += n2;
            c += n3;
        }
        if (n1 >= n3 && n3 >= n2) {
            a += n1;
            b += n3;
            c += n2;
        }


        if (n2 >= n1 && n1 >= n3) {
            a += n2;
            b += n1;
            c += n3;
        }
        if (n2 >= n3 && n3 >= n1) {
            a += n2;
            b += n3;
            c += n1;
        }


        if (n3 >= n1 && n1 >= n2) {
            a += n3;
            b += n1;
            c += n2;
        }
        if (n3 >= n2 && n2 > n1) {
            a += n3;
            b += n2;
            c += n1;
        }

        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        }
        if (a * a == b * b + c * c ) {
            System.out.println("TRIANGULO RETANGULO");
        }
        if (a * a > b * b + c * c && !(a >= b + c)) {
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        if (a * a < b * b + c * c) {
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (a == b && b == c) {
            System.out.println("TRIANGULO EQUILATERO");
        }
        if (a == b && b != c || a == c && b != c || b == c && c != a) {
            System.out.println("TRIANGULO ISOSCELES");
        }


    }
}
