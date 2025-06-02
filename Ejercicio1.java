import java.util.Scanner;
public class Ejercicio1 {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario una frase
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();

        // Contar las palabras en la frase
        int cantidadPalabras = contarPalabras(frase);

        // Mostrar el resultado
        System.out.println("La cantidad de palabras en la frase es: " + cantidadPalabras);

        scanner.close();
    }

    // Método para contar palabras en una frase
    public static int contarPalabras(String frase) {
        // Eliminar espacios al inicio y al final
        frase = frase.trim();

        // Dividir la frase en palabras usando espacios como separadores
        String[] palabras = frase.split("\\s+");

        // Retornar la cantidad de palabras
        return palabras.length;
    }
}