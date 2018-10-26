import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 0;
        int sum = 0;
        double aver = 0;

        for (i = 1; i <= 6; i++) {
            double n = scan.nextDouble();

            if (n > 0) {
                sum++;
                aver += n;
            }

        }
        System.out.println(sum + " valores positivos");
        System.out.printf("%.1f%n",(aver / sum));
    }
}
