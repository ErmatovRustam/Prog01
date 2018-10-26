import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x = scan.nextDouble();
        double y = scan.nextDouble();

        if (x == 0.00 && y == 0.00) {
            System.out.println("Origem");

        } else if (x > 0.00 && y > 0.00) {
            System.out.println("Q1");

        } else if (x > 0.00 && y < 0.00) {
            System.out.println("Q4");

        } else if (x < 0.00 && y < 0.00) {
            System.out.println("Q3");

        } else if (x == 0.00 && y != 0.00) {
            System.out.println("Eixo Y");

        }else if (x != 0.00 && y == 0.00) {
            System.out.println("Eixo X");

        }

        else {
            System.out.println("Q2");

        }


    }
}
