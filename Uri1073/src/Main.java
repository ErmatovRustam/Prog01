import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 0;
        int n = scan.nextInt();

        for (i = 1; i <= n; i++) {


            if (i % 2 == 0) {


                System.out.println(i + "^2 = " + i * i);
            }
        }
    }
}
