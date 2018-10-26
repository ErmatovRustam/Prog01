
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("A four digit number? ");
        int n = scan.nextInt();

        int s = 0;

        s += n % 10;
        n /= 10;

        s += n % 10;
        n /= 10;

        s += n % 10;
        n /= 10;

        s += n % 10;
        n /= 10;

        System.out.println("A sum of four digit numbers is " + s);
    }
}
