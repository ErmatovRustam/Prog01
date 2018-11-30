import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sum = 0;
        int i = 0;


        while (true) {
            int n = scan.nextInt();
            if (n < 0) {
                break;
            } else {
                i++;
                sum += n;
            }
        }
        double ave =(double) (sum / i);

        System.out.printf("%.2f%n", ave);
    }
}
