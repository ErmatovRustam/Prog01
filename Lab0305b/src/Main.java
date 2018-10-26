import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Number of points? ");

        double p = scan.nextDouble();
        String mag = "Grade: F";

        if (p < 0 || p > 100) {
            System.out.println(p + " %dis not in the permitted range.");
        } else if (90 <= p) {
            mag = "Grade: A";
        } else if (80 <= p) {
            mag = "Grade: B";
        } else if (70 <= p) {
            mag = "Grade: C";
        } else if (60 <= p) {
            mag = "Grade: D";
        } else if (0 <= p) {
            mag = "Grade: F";
        }
        System.out.println(mag);
    }
}
