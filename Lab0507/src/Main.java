import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Number of students: ");
        int n = scan.nextInt();
        int i = 0;
        double max = 0;
        double max2 = 0;
        double sc = 0;
        String n1 = "";
        String n2 = "";
        String name;

        for (i = 1; i <= n; i++) {

            System.out.print("Student name: ");
            name = scan.next();
            System.out.print("Student's score: ");
            sc = scan.nextDouble();

            max2 = max;
             max = Math.max(sc, max);



        }
        System.out.println("The highest score is: " + n1 + " - " + max);
        System.out.println("The second highest score is: " + n2 + " - " + max2);
    }
}
