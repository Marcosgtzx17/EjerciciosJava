import java.util.LinkedHashSet;
import java.util.Scanner;
public class EjercioLibro {
    static class Libro {
        private int id;
        private String titulo;
        private String edicion;
        private String autor;

        public Libro(int id, String titulo, String edicion, String autor) {
            this.id = id;
            this.titulo = titulo;
            this.edicion = edicion;
            this.autor = autor;
        }

        public int getId() {
            return id;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getEdicion() {
            return edicion;
        }

        public String getAutor() {
            return autor;
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Título: " + titulo + ", Edición: " + edicion + ", Autor: " + autor;
        }
    }

    public static void main(String[] args) {
        LinkedHashSet<Libro> libros = new LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);
        char continuar;

        System.out.println("=== Ingreso de Libros ===");

        do {
            System.out.print("Ingrese el ID del libro: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            System.out.print("Ingrese el título del libro: ");
            String titulo = scanner.nextLine();

            System.out.print("Ingrese la edición del libro: ");
            String edicion = scanner.nextLine();

            System.out.print("Ingrese el autor del libro: ");
            String autor = scanner.nextLine();

            // Agregar libro al LinkedHashSet
            libros.add(new Libro(id, titulo, edicion, autor));

            System.out.print("¿Desea ingresar otro libro? (s/n): ");
            continuar = scanner.next().toLowerCase().charAt(0);
            scanner.nextLine(); // Limpiar el buffer
        } while (continuar == 's');

        System.out.println("\n=== Listado de Libros ===");
        for (Libro libro : libros) {
            System.out.println(libro);
        }

        scanner.close();
    }
}