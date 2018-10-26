import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Number of points? ");

        double points = scan.nextDouble();

        if (points >= 40) {
            System.out.println("You passed !!!");
        } else {

            System.out.println("You failed ? !! ");
        }
    }
}
