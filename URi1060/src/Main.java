import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            double n = scan.nextDouble();
            if (n > 0.0) {
                ++sum;
            }
        }
        System.out.println(sum + " valores positivos");
    }
}
