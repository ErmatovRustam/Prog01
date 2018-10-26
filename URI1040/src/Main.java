import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float n1 = scan.nextFloat();
        float n2 = scan.nextFloat();
        float n3 = scan.nextFloat();
        float n4 = scan.nextFloat();

        float avern1 = n1 * 2;
        float avern2 = n2 * 3;
        float avern3 = n3 * 4;
        float avern4 = n4 * 1;

        float gpa = (avern1 + avern2 + avern3 + avern4) / 10;

        System.out.printf("Media: %.1f\n", gpa);

        if (gpa >= 7) {
            System.out.println("Aluno aprovado.");
        }
        else if (gpa < 5) {
            System.out.println("Aluno reprovado.");
        }
        else if (gpa >= 5 && gpa <7){
            System.out.println("Aluno em exame.");
            float n5 = scan.nextFloat();
            gpa = (gpa+n5) / 2;
            System.out.printf("Nota do exame: %.1f\n", n5);
            if (gpa >= 5)
                System.out.println("Aluno aprovado.");
            else
                System.out.println("Aluno reprovado.");

            System.out.printf("Media final: %.1f\n", gpa);
        }
    }
}
