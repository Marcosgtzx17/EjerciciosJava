import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio10 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> numeros = new TreeSet<>();
        char continuar;

        System.out.println("=== Ingreso de Números ===");

        do {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            numeros.add(numero);

            System.out.print("¿Desea ingresar otro número? (s/n): ");
            continuar = scanner.next().toLowerCase().charAt(0);
        } while (continuar == 's');

        System.out.println("\n=== Listado de Números Ingresados (Ordenados) ===");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        scanner.close();
    }
}
