import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        float c = scan.nextFloat();

        float ab = (a + b) / 2;
        float area = ab * c;
        float peri = a + b + c;

        if (a< b+c && b < a+c && c < a+b){
            System.out.printf("Perimetro = %.1f%n", peri);
        } else{
            System.out.printf("Area = %.1f%n", area);
        }

    }
}
