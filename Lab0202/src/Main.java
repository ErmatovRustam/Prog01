import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1st value: ");

        int a = scan.nextInt();

        System.out.print("2nd value: ");

        int b = scan.nextInt();

        System.out.println("Before swapping: a = " + a + " b = " + b);


        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping:  a = " + a + " b = " + b);
    }
}
