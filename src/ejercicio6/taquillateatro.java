package ejercicio6;

import java.util.Scanner;

public class taquillateatro {
    public static void main(String[] args) {
        char[][] teatro = new char[5][5];
        Scanner sc = new Scanner(System.in);
        gestorsala.inicializarMatriz(teatro);
        String opcion;
        do {
            System.out.println("elige una opcion");
            System.out.println("1. asientos");
            System.out.println("2. reservar asientos");
            System.out.println("3. salir");
            opcion = sc.next();
            switch (opcion) {
                case "1":
                    gestorsala.mostrarMatriz(teatro);
                    break;
                case "2":
                        System.out.println("que sitio quieres resevar");
                        System.out.println("Fila");
                        int fila = sc.nextInt();
                        System.out.println("asiento");
                        int columna = sc.nextInt();
                        gestorsala.reservarasientos(teatro, fila, columna);

                        break;
                        default:
                            System.out.println("opcion incorrecta");
                        break;
            }
        }while(!opcion.equals("3"));
    }
}
