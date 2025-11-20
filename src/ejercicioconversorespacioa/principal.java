package ejercicioconversorespacioa;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Estas son las tasa");
        conversorespacial.mostrartasas();
        System.out.println("cuantos euros tienes");
        double euros = sc.nextDouble();
        double precio=500;
        euros = conversorespacial.eurosAcreditos(euros);
        double saldo=euros;
        System.out.println("Tienes "+euros+" Creditos");

        if (conversorespacial.validarcompra(500,euros)){
            System.out.println("as comprado una nave espacial");
            euros = saldo-precio;
            System.out.println("te quedan "+euros+" creditos");
        }
        else {
            System.out.println("no es comprado una nave espacial");
        }
    }
}
