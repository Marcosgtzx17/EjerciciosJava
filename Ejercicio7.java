import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {
     public static void main(String[] args) {
        // Declaración de variables y objetos
        ArrayList<Double> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String continuar;
        double suma = 0;
        int positivos = 0;

        System.out.println("=== Programa para almacenar números y calcular estadísticas ===");

        // Bucle para capturar valores
        do {
            System.out.print("Ingrese un número (puede ser decimal): ");
            double numero = scanner.nextDouble();
            numeros.add(numero);

            // Sumar al total y contar positivos
            suma += numero;
            if (numero > 0) {
                positivos++;
            }

            System.out.print("¿Desea ingresar otro número? (s/n): ");
            continuar = scanner.next();

        } while (continuar.equalsIgnoreCase("s"));

        // Cálculo del promedio
        double promedio = numeros.isEmpty() ? 0 : suma / numeros.size();

        // Mostrar resultados
        System.out.println("\n=== Resultados ===");
        System.out.println("Cantidad de números ingresados: " + numeros.size());
        System.out.println("Promedio de los números: " + promedio);
        System.out.println("Cantidad de números positivos: " + positivos);

        scanner.close();
    }
}


