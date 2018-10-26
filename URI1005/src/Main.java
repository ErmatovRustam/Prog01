import java.util.*;

public class Main {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       double a = scan.nextDouble();
       double b = scan.nextDouble();
       double c = a*3.5/11;
       double e = b*7.5/11;
       double f = c+e;


       System.out.print("MEDIA = ");
       System.out.printf("%.5f\n",f);


    }
}
