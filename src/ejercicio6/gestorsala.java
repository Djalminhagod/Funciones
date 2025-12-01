package ejercicio6;

public class gestorsala {
    public static void inicializarMatriz(char[][] sala){
    for (int i = 0; i < sala.length; i++) {
        for (int j = 0; j < sala.length; j++) {
            sala[i][j] = 'L';
        }

    }
    }
    public static void mostrarMatriz(char[][] sala){
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala.length; j++) {
                System.out.print(sala[i][j]);
            }
            System.out.println();
        }
    }
    public static boolean reservarasientos(char[][] sala,int fila,int columna){
        if (sala[fila][columna] == 'L'){
            sala[fila][columna] = 'x';
            return true;
        } else if (sala[fila][columna]=='x') {
            System.out.println("------------------------");
            System.out.println("Elige otro esta ocupado");
            System.out.println("------------------------");
            return false;
        }

        return false;
    }
}
