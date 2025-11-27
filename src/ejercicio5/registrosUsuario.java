package ejercicio5;

public class registrosUsuario {
    public static  boolean espasswordsegura(String pass) {
        if (pass.length()>=8) {
            System.out.println("la contraseña es segura");
            return true;
        }else{
            return false;
        }

    }
    public static String  formatearnombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            return nombre;
        }
        return nombre.substring(0, 1).toUpperCase() + nombre.substring(1);
    }
    public static boolean emailvalido(String email) {
        if (email.contains("@")) {
            return true;
        }
        return false;
    }
    public static void  mostrarerrores(){
            System.out.println("La contraseña tiene que tener 8 caracteres");

    }





    }

