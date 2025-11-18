package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero ");
        int num = sc.nextInt();
        System.out.println( );

        for (int i = 1; i <= num; i++) {
            int resultado = num * i;
            num = resultado;
            System.out.println(num+resultado);
        }

    }
    private static void factorial(int num) {


    }
}
