import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x;
        int z;
        int i = 0;

        while ((x = scan.nextInt()) < (z = scan.nextInt())) {

            for (i = x; i <= z; i++ ){

                if((x+i)>z){
                    System.out.println(i);
                }
            }
        }
    }
}
