package imprimiriniciales;
import java.util.Scanner;

/**
 *
 * @author maryse
 *
 * Scanner Este programa imprime las iniciales del nombre introducido por el
 * usuario.
 *
 */
public class ImprimirIniciales {
    
    static String nombre; // nombre
    static String apellido; // apellido
    Scanner stdIn = new Scanner(System.in);
    
    
 public void entrada () {
    
     System.out.print("Introduzca su nombre y primer apellido separados por un espacio: ");
        nombre = stdIn.next();
        apellido = stdIn.next();
    
}
    public static void main(String[] args) {

        ImprimirIniciales nombreApellido = new ImprimirIniciales();
        nombreApellido.entrada();

        System.out.println("Sus iniciales son " + nombre.charAt(0) + apellido.charAt(0) + ".");

    }

}
