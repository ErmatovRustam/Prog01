import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String first = scan.nextLine();
        String second = scan.nextLine();
        String third = scan.nextLine();


        if (first.equals("vertebrado") && second.equals("ave") && third.equals("carnivoro")) {
            System.out.println("aguia");
        }
        if (first.equals("vertebrado") && second.equals("ave") && third.equals("onivoro")) {
            System.out.println("pomba");
        }
        if (first.equals("vertebrado") && second.equals("mamifero") && third.equals("onivoro")) {
            System.out.println("homem");
        }
        if (first.equals("vertebrado") && second.equals("mamifero") && third.equals("herbivoro")) {
            System.out.println("vaca");
        }
        if (first.equals("invertebrado") && second.equals("inseto") && third.equals("hematofago")) {
            System.out.println("pulga");
        }
        if (first.equals("invertebrado") && second.equals("inseto") && third.equals("herbivoro")) {
            System.out.println("lagarta");
        }
        if (first.equals("invertebrado") && second.equals("anelideo") && third.equals("hematofago")) {
            System.out.println("sanguessuga");
        }
        if (first.equals("invertebrado") && second.equals("anelideo") && third.equals("onivoro")) {
            System.out.println("minhoca");
        }


    }
}
