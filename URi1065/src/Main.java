import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 0;
        int sum = 0;

        for (i = 1; i <= 5; i++) {
            double n = scan.nextDouble();

            if (n %2== 0) {
                sum++;
            }

        }
        System.out.println(sum + " valores pares");

    }
}
