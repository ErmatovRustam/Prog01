import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName = scan.nextLine();
        double salary = scan.nextDouble();
        double sale = scan.nextDouble();
        double bonus = sale * 0.15;
        System.out.printf("TOTAL = R$ %.2f\n", (salary + bonus));


    }
}
