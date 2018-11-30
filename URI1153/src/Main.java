import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int i = 0;
        int s = 1;
        int n = scan.nextInt();
        for (i = 1; i <= n; i++) {
            s *= i;
        }
        System.out.println(s);
    }
}
