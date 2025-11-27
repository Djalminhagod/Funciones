package ejercicio5;

import java.util.Scanner;

public class Validador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass;
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        nombre=registrosUsuario.formatearnombre(nombre);
        System.out.println("ingrese su email ");
        String email = sc.nextLine();
        if(registrosUsuario.emailvalido(email)==false){
            System.out.println("repite no tiene @");
            email = sc.nextLine();
        }

        do {
            System.out.println("Ingrese una Contraseña: ");
            pass=sc.nextLine();
            if (registrosUsuario.espasswordsegura(pass)==false) {
                registrosUsuario.mostrarerrores();
            }
        }while (registrosUsuario.espasswordsegura(pass)==false);
        System.out.println("Bienvenido "+nombre+" tu email es "+email);

    }

}
