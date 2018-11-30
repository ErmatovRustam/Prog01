import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int i = 0;


        for (i = 2; i < 10000; i++) {
            if (i % n == 2) {
                System.out.println(i);
            }
        }
    }
}
