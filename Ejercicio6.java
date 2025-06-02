import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar palabra al usuario
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        // Verificar si es palíndroma
        if (esPalindromo(palabra)) {
            System.out.println("La palabra \"" + palabra + "\" es un palíndromo.");
        } else {
            System.out.println("La palabra \"" + palabra + "\" no es un palíndromo.");
        }

        scanner.close();
    }

    // Método para verificar si una palabra es palíndroma
    public static boolean esPalindromo(String palabra) {
        // Normalizar palabra (sin mayúsculas ni espacios)
        palabra = palabra.replaceAll("\\s", "").toLowerCase();

        // Recorrer la palabra y comparar extremos
        int longitud = palabra.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(longitud - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
