import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double inputNum = scan.nextDouble();

        if (inputNum > 75.00 && 100.00 >= inputNum) {
            System.out.println("Intervalo (75,100]");
        }
        if (inputNum > 50.00 && 75.00 >= inputNum) {
            System.out.println("Intervalo (50,75]");
        }

        if (inputNum > 25.00 && 50.00 >= inputNum) {
            System.out.println("Intervalo (25,50]");
        }

        if (inputNum >= 0.00 && 25.00 >= inputNum) {
            System.out.println("Intervalo [0,25]");
        }
        if (inputNum < 0 || inputNum > 100) {
            System.out.println("Fora de intervalo");
        }


    }
}