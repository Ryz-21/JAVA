public class Ejercicio3 {

    /*
    3. Enum de niveles de usuario
Crea un enum llamado NivelUsuario con los valores:
ADMIN, EDITOR, USUARIO.
Plantea un sistema que permita o niegue el acceso a ciertas acciones según el nivel.
 */ 
    public enum NivelUsuario {
        ADMIN, EDITOR, USUARIO
    }

    public static void validacion (NivelUsuario a){
        if (a == NivelUsuario.ADMIN){
            System.out.println("tienes permisos de administrador");
        } else if (a == NivelUsuario.EDITOR){
            System.out.println("tienes permiso de editor");
        } else if (a == NivelUsuario.USUARIO){
            System.out.println("tienes permiso de usuario");
        }
    }

    public static void main(String[] args) {
        NivelUsuario nivel = NivelUsuario.ADMIN;
        validacion(nivel);
    }
}
