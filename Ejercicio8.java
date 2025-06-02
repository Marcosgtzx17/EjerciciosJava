import java.util.ArrayList;

public class Ejercicio8{
     // Clase entidad Alumno
    static class Alumno {
        private String codigo;
        private String nombre;
        private String carnet;

        // Constructor
        public Alumno(String codigo, String nombre, String carnet) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.carnet = carnet;
        }

        // Getters
        public String getCodigo() {
            return codigo;
        }

        public String getNombre() {
            return nombre;
        }

        public String getCarnet() {
            return carnet;
        }

        // Método para mostrar información del alumno
        @Override
        public String toString() {
            return "Código: " + codigo + ", Nombre: " + nombre + ", Carnet: " + carnet;
        }
    }

    public static void main(String[] args) {
        // Crear una LinkedList para almacenar alumnos
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        // Agregar datos de ejemplo
        listaAlumnos.add(new Alumno("001", "Ana García", "C001"));
        listaAlumnos.add(new Alumno("002", "Luis Pérez", "C002"));
        listaAlumnos.add(new Alumno("003", "María López", "C003"));

        // Mostrar los alumnos en la consola
        System.out.println("=== Lista de Alumnos ===");
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }
    }
}
