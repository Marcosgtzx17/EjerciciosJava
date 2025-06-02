import java.util.Scanner;

public class Ejercicio5 {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la frase ingresada por el usuario
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();

        // Contar la cantidad de veces que aparece la vocal 'A' o 'a'
        int cantidadA = contarVocalA(frase);

        // Mostrar el resultado
        System.out.println("La vocal 'A' aparece " + cantidadA + " veces en la frase.");

        scanner.close();
    }

    // Método para contar la cantidad de veces que aparece la vocal 'A' o 'a'
    public static int contarVocalA(String frase) {
        int contador = 0;

        // Convertir la frase a minúsculas o mayúsculas para ignorar diferencias de caso
        frase = frase.toLowerCase();

        // Recorrer cada carácter de la frase
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a') {
                contador++;
            }
        }

        return contador;
    }
}
