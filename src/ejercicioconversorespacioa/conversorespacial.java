package ejercicioconversorespacioa;




public class conversorespacial
{

    public static void  mostrartasas() {
        System.out.println("1 Crédito = 1.5 Dólares | 1 Crédito = 0.9 Euros");
    }
    public static double dolaresAcreditos(double dolares){
        return dolares/1.5;
    }
    public static double eurosAcreditos(double euros){
        return euros/0.9;
    }public static boolean validarcompra(double precio, double saldo){
        if(precio<=saldo){
            return true;
        }
        return false;
}
}

