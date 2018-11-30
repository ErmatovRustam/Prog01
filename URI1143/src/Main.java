import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int i = 0;


        for (i = 1; i <= n; i++) {

            System.out.println(i + " " + (i * i) + " " + (i * i * i));
        }


    }
}
