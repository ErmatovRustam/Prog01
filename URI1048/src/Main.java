import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salary = scan.nextDouble();
        double add = 0;
        double newS = 0;

        if (salary >= 0.00 && salary <= 400.00) {
            newS = salary + salary * 0.15;
            System.out.printf("Novo salario: %.2f\n", newS);
            System.out.printf("Reajuste ganho: %.2f\n", salary * 0.15);
            System.out.println("Em percentual: 15 %");
        }
        if (salary > 400.00 && salary <= 800.00) {
            newS = salary + salary * 0.12;
            System.out.printf("Novo salario: %.2f\n", newS);
            System.out.printf("Reajuste ganho: %.2f\n", salary * 0.12);
            System.out.println("Em percentual: 12 %");
        }
        if (salary > 800.00 && salary <= 1200.00) {
            newS = salary + salary * 0.10;
            System.out.printf("Novo salario: %.2f\n", newS);
            System.out.printf("Reajuste ganho: %.2f\n", salary * 0.10);
            System.out.println("Em percentual: 10 %");
        }
        if (salary > 1200.00 && salary <= 2000.00) {
            newS = salary + salary * 0.07;
            System.out.printf("Novo salario: %.2f\n", newS);
            System.out.printf("Reajuste ganho: %.2f\n", salary * 0.07);
            System.out.println("Em percentual: 7 %");
        }
        if (salary > 2000.00) {
            newS = salary + salary * 0.04;
            System.out.printf("Novo salario: %.2f\n", newS);
            System.out.printf("Reajuste ganho: %.2f\n", salary * 0.04);
            System.out.println("Em percentual: 4 %");
        }

    }
}
