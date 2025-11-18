package contarletras;

import java.util.Scanner;

public class contarletras {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("introduce palabra para contar las letras");
        String contarletra= sc.nextLine();
        System.out.println("introduce letras");
        char letra=sc.next().charAt(0);
        contarletras(contarletra,letra);
        int contar=contarletras(contarletra,letra);
        System.out.println("palabra con "+contar+" letras");


    }
    private static int contarletras(String palabra, char letra){
        int contar=0;
        for(int i=0;i<palabra.length();i++){
            if(palabra.charAt(i)==letra){
                contar++;
            }
        }
        return contar;
    }

}
