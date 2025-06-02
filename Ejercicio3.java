import java.util.Scanner;

public class Ejercicio3 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la cadena ingresada por el usuario
        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();

        // Convertir la primera letra y la primera letra después de un espacio a mayúsculas
        String resultado = capitalizarPalabras(cadena);

        // Mostrar el resultado
        System.out.println("Cadena con capitalización: " + resultado);

        scanner.close();
    }

    // Método para capitalizar la primera letra de cada palabra
    public static String capitalizarPalabras(String cadena) {
        StringBuilder resultado = new StringBuilder();
        boolean convertirEnMayuscula = true;

        for (char c : cadena.toCharArray()) {
            if (convertirEnMayuscula && Character.isLetter(c)) {
                resultado.append(Character.toUpperCase(c));
                convertirEnMayuscula = false;
            } else {
                resultado.append(c);
            }
            if (c == ' ') {
                convertirEnMayuscula = true;
            }
        }

        return resultado.toString();
    }
}

