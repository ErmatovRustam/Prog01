import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Number of points? ");

        double p = scan.nextDouble();

        if (p < 0 || p > 100) {
            System.out.println(p + " %dis not in the permitted range.");
        }

        if (90 <= p && p <= 100) {
            System.out.println("Grade: A");
        }
        if (80 <= p && p < 90) {
            System.out.println("Grade: B");
        }
        if (70 <= p && p < 80) {
            System.out.println("Grade: C");
        }
        if (60 <= p && p < 70) {
            System.out.println("Grade: D");
        }
        if (0 <= p && p < 60) {
            System.out.println("Grade: F");
        }

    }
}
