import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 0;
        int even = 0;
        int odd = 0;
        int pos = 0;
        int neg = 0;

        for (i = 1; i <= 5; i++) {
            int a = scan.nextInt();

            if (a % 2 == 0 || a == 2 || a== -2 || a % -2 == 0) {
                even += 1;
            }
            if (a % 2 == 1 || a == 1 || a== -1 || a % 2 == -1) {
                odd += 1;
            }
            if (a > 0) {
                pos += 1;
            }
            if (a < 0) {
                neg += 1;
            }
        }
        System.out.println(even + " valor(es) par(es)");
        System.out.println(odd + " valor(es) impar(es)");
        System.out.println(pos + " valor(es) positivo(s)");
        System.out.println(neg + " valor(es) negativo(s)");

    }
}
