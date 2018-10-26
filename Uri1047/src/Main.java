import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int begH = scan.nextInt();
        int begM = scan.nextInt();
        int endH = scan.nextInt();
        int endM = scan.nextInt();

        int min = 24 * 60;


        if (begH < endH || (begH == endH && begM < endM)) {
            int duration1 = (endH - begH) * 60 + endM - begM;
            int hours = duration1 / 60;
            int minutes = duration1 - hours * 60;

            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", hours, minutes);
        } else {
            int duration = min - begH * 60 - begM + endH * 60 + endM;

            int hours = duration / 60;
            int minutes = duration - hours * 60;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", hours, minutes);
        }


    }
}


//      else if (begH < endH && begM <= endM ) {
//         durH = endH - begH;
//         durM = endM - begM;
//         System.out.println("O JOGO DUROU " + durH + " HORA(S) E " + durM + " MINUTO(S)");
//     }
//     if (begH > endH && begM > endM && !(begH > 12)) {
//         durH = begH - endH - 1;
//         durM = 60 - (begM - endM);
//         System.out.println("O JOGO DUROU " + durH + " HORA(S) E " + durM + " MINUTO(S)");
//     }
//     if (begH <= endH && begM > endM) {
//         durH = endH - 1 - begH;
//         durM = 60 - (begM - endM);
//         System.out.println("O JOGO DUROU " + durH + " HORA(S) E " + durM + " MINUTO(S)");
//     }
//     if (begH > endH && begM <= endM) {
//         durH = 24 - begH + endH;
//         durM = endM - begM;
//         System.out.println("O JOGO DUROU " + durH + " HORA(S) E " + durM + " MINUTO(S)");
//     }
//     if (begH > endH && begM >= endM && !(begH < 12)) {
//         durH = 24 - begH + endH - 1;
//         durM = 60 - (begM - endM);
//         System.out.println("O JOGO DUROU " + durH + " HORA(S) E " + durM + " MINUTO(S)");
//     }
//     if (begH == endH && begM < endM ) {
//         durH = 0;
//         durM = endM - begM;
//         System.out.println("O JOGO DUROU " + durH + " HORA(S) E " + durM + " MINUTO(S)");
//     }


