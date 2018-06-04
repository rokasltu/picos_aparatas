package PicosAparatoInterfeisai;

import java.util.Scanner;

//kas cia bus//kas cia bus

public class Main {

    public static void main (String [] arg) {

        Picos_aparatas PicAp = new Picos_aparatas(new Produktai(1,1,1,1,1));

        Scanner sc = new Scanner(System.in);
        System.out.println("Kokia gaminsite Pica: Margarita, Mexicano, Socioji, Nieko");
        String pica_pav = sc.next();
        System.out.println("Kokio dydzio pica: nuo 21 iki 50");
        int pica_dyd = sc.nextInt();


        PicAp.gaminkPica(pica_pav, pica_dyd);
    }


}
