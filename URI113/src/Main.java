import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i1 = scan.nextInt();
        int g1 = scan.nextInt();
        int it = 0;
        int gt = 0;
        int dr = 0;
        int t = 1;

        if (i1 > g1) {
            it += 1;
        }
        if (i1 < g1) {
            gt += 1;
        } if(i1 ==g1) {
            dr += 1;
        }

        System.out.println("Novo grenal (1-sim 2-nao)");

        int or;

        while ((or = scan.nextInt()) != 2) {

            if (or == 1) {
                t += 1;
                int i2 = scan.nextInt();
                int g2 = scan.nextInt();

                if (i2 > g2) {
                    it += 1;
                }
                if (i2 < g2) {
                    gt += 1;
                } if(i1 ==g1) {
                    dr += 1;
                }
                System.out.println("Novo grenal (1-sim 2-nao)");
            } else {
                System.out.println("Novo grenal (1-sim 2-nao)");
            }
        }
        System.out.println(t + " grenais");
        System.out.println("Inter:" + it);
        System.out.println("Gremio:"+ gt);
        System.out.println("Empates:"+ dr);

        if(it > gt){
            System.out.println("Inter venceu mais");
        }
        else if(gt > it){
            System.out.println("Gremio venceu mais");
        }else{
            System.out.println("Não houve vencedor");
        }
    }
}
