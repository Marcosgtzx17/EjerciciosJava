import java.util.Scanner;

public class Ejercicio4 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la frase ingresada por el usuario
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();

        // Eliminar la última palabra de la frase
        String fraseSinUltimaPalabra = eliminarUltimaPalabra(frase);

        // Mostrar el resultado
        System.out.println("Frase sin la última palabra: " + fraseSinUltimaPalabra);

        scanner.close();
    }

    // Método para eliminar la última palabra de una frase
    public static String eliminarUltimaPalabra(String frase) {
        if (frase == null || frase.isEmpty()) {
            return frase; // Si la frase está vacía o es nula, la devolvemos como está
        }

        // Encontrar el último espacio en blanco en la frase
        int ultimoEspacio = frase.lastIndexOf(' ');

        // Si no hay espacios, significa que hay una sola palabra, devolvemos una cadena vacía
        if (ultimoEspacio == -1) {
            return "";
        }

        // Retornar la frase sin la última palabra
        return frase.substring(0, ultimoEspacio);
    }
}
