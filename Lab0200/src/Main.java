import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        int fourth = ((a % 10));
        int third = ((a / 10)%10);
        int second = (a / 10) / 10 % 10;
        int first = (a / 10) / 10 / 10 % 10;


        System.out.println(fourth + third + second + first
        );
    }
}
