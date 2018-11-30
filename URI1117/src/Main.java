import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        double x,y;
        while(((x = scan.nextDouble())>0 ) && ((y = scan.nextDouble())>0 ) && (x<=10) && (y<=10)){


            if(x >10 || x<0){
                System.out.println("nota invalida");
            }
            if(y >10 || y<0){
                System.out.println("nota invalida");
            }
            if(((x+ y) < 0)|| ((x+y)>10)) {
                System.out.println("nota invalida");
            }
            else {
                double m = (x + y) / 2.00;
                System.out.printf("%.2f%n" , m);
            }

        }

    }
}
