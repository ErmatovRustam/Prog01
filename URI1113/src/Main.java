import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while (true){

            int a = scan.nextInt();
            int b = scan.nextInt();

            if(a==b){
                break;
            }
            if (a<b){
                System.out.println("Crescente");
            }
            if (b<a){
                System.out.println("Decrescente");
            }
        }

    }
}
