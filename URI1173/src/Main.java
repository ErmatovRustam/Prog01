import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int n[] = new int[10];

        int i = 0;
        n[i] = scan.nextInt();
        System.out.println("N[" + i + "] = " + n[i]);
        int a = n[i];
        for (i = 1; i < n.length; i++) {
            a = a * 2;
            System.out.println("N[" + i + "] = " + a);


        }
    }
}
