import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double salary = scan.nextDouble();
        double tax = 0;

        if (salary <= 2000) {
            System.out.println("Isento");
        }
        else if (salary > 2000.00 && salary <=3000.00){
            tax = (salary - 2000.00) * 0.08;
            System.out.printf("R$ %.2f\n" , tax);

        }
       else  if (salary > 3000.00 && salary <=4500.00) {
            tax = ((1000 * 0.08) + (salary - 3000.00) * 0.18);
            System.out.printf("R$ %.2f\n" , tax);
        }

          else if (salary > 4500.00){
                tax = (((salary - 4500) * 0.28)+ (1500 * 0.18)+ (1000 * 0.08));
            System.out.printf("R$ %.2f\n" , tax);

        }


    }
}
