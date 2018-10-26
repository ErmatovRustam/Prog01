import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        final double PI = 3.14159;
        double areaTra = (a * c) * 0.5;
        double areaCir = PI * c * c;
        double areaTrap = (a + b) / 2 * c;
        double areaSqua = b * b;
        double areaRec = a * b;

        System.out.printf("TRIANGULO: %.3f\n", areaTra);
        System.out.printf("CIRCULO: %.3f\n", areaCir);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrap);
        System.out.printf("QUADRADO: %.3f\n", areaSqua);
        System.out.printf("RETANGULO: %.3f\n", areaRec);

    }
}
