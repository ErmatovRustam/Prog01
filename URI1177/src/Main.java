import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i, j = 0;
        int[] n = new int[1000];

        int a = scan.nextInt();

        for (i = 0, j = 0; i < 1000; i++, j++) {

            n[j] = j;

            if ((n[j]) == a) {
                j = 0;
            }
            System.out.println("N[" + i + "]" + n[j]);

        }
    }
}