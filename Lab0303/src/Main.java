import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1st number? ");
        int a = scan.nextInt();

        System.out.println("2nd number? ");
        int b = scan.nextInt();

        System.out.println("3rd number? ");
        int c = scan.nextInt();


        int max = a;

        if (max < b) {
            max = b;
        }

        if (max < c) {
            max = c;
        }

        System.out.printf("The value %d is the  greatest one.%n", max);

    }
}
