package taquillacine;

import java.util.Scanner;

public class taquilla {
    public static void main(String[] args) {
        double precio = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.println("ingrese pelicula");
        String pelicula = sc.next();
        System.out.println("es dia del espectador: (true/false)");
        System.out.println("introduzca la butaca ");
        int butaca = sc.nextInt();
        boolean diaespecial = sc.nextBoolean();
        Gestorentradas.calcularprecio(edad,diaespecial);
        

        Gestorentradas.imprimirticket(pelicula,butaca,precio);
    }
}
