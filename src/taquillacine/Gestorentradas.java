package taquillacine;

public class Gestorentradas {
    private static final double preciobase=10;
    public static double getpreciobase(){
        return preciobase;
    }
    public static double calcularprecio(int edad,boolean diaespecial) {
        double preciofinal=0.0;
        if (edad>65) {
            preciofinal= preciobase*0.5;
        }else if (diaespecial) {
            preciofinal= preciobase*0.8;
        }else  {
            preciofinal= preciobase;
        }
        return preciofinal;

    }
    public static void imprimirticket(String pelicula,int butaca,double precio) {
        precio=preciobase;
        System.out.println("la pelicula es " + pelicula);
        System.out.println("la butaca es " + butaca);
        System.out.println("la precio es " + precio);
    }
}
