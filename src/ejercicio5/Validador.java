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
        do {
            if(!registrosUsuario.emailvalido(email)){
                System.out.println("repite no tiene @");
                email = sc.nextLine();
            }

        }while(!registrosUsuario.emailvalido(email));
        do {
            if(!registrosUsuario.emailvalido(email)){
                System.out.println("repite no tiene @");
                email = sc.nextLine();
            }
            System.out.println("Ingrese una Contraseña: ");
            pass=sc.nextLine();
            if (!registrosUsuario.espasswordsegura(pass)) {
                registrosUsuario.mostrarerrores();
            }
        }while (!registrosUsuario.espasswordsegura(pass));
        System.out.println("Bienvenido "+nombre+" tu email es "+email);

    }

}
