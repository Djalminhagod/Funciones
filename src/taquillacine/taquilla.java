package taquillacine;

import java.util.Scanner;

public class taquilla {
    public static void main(String[] args) {
        System.out.println(Gestorentradas.getpreciobase());
        System.out.println(Gestorentradas.calcularprecio(20, true));
        System.out.println(Gestorentradas.calcularprecio(20, false));
        System.out.println(Gestorentradas.calcularprecio(66, true));
        System.out.println(Gestorentradas.calcularprecio(66, false));
        Gestorentradas.imprimirticket("cars",15,20);
    }
}
