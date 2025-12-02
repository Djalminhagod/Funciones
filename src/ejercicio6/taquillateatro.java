package ejercicio6;

import java.util.Scanner;

public class taquillateatro {
    public static void main(String[] args) {
        char[][] teatro = new char[5][5];
        Scanner sc = new Scanner(System.in);
        boolean sala = false;
        gestorsala.inicializarMatriz(teatro);
        String opcion;
        do {
            System.out.println("elige una opcion");
            System.out.println("1. asientos");
            System.out.println("2. reservar asientos");
            System.out.println("3. salir");
            opcion = sc.next();
            int fila=0, columna=0;
            switch (opcion) {
                case "1":
                    gestorsala.mostrarMatriz(teatro);
                    break;
                case "2":
                    do {
                        System.out.println("que sitio quieres resevar");
                        System.out.println("Fila");
                        fila = sc.nextInt();
                        System.out.println("asiento");
                        columna = sc.nextInt();
                        if (fila<0 || columna<0 || fila>4 || columna>4) {
                            sala = false;
                            System.out.println("incorrecto repite");
                        }else  {
                            gestorsala.reservarasientos(teatro, fila, columna);
                            sala = true;
                        }

                    }while (sala);
                        break;
                        default:
                            System.out.println("opcion incorrecta");
                        break;
            }
        }while(!opcion.equals("3"));
    }
}
