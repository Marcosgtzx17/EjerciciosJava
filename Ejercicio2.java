import java.util.Scanner;
public class Ejercicio2 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la cadena ingresada por el usuario
        System.out.print("Ingresa una cadena con espacios en blanco: ");
        String cadena = scanner.nextLine();

        // Eliminar espacios en blanco
        String cadenaSinEspacios = cadena.replaceAll("\\s+", "");

        // Mostrar la cadena sin espacios
        System.out.println("Cadena sin espacios: " + cadenaSinEspacios);

        scanner.close();
    }
}