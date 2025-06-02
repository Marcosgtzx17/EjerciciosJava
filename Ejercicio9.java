import java.util.LinkedList;

public class Ejercicio9 {
     // Clase entidad Alumno
    static class Alumno {
        private String codigo;
        private String nombre;
        private String carnet;

        public Alumno(String codigo, String nombre, String carnet) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.carnet = carnet;
        }

        public String getCodigo() {
            return codigo;
        }

        public String getNombre() {
            return nombre;
        }

        public String getCarnet() {
            return carnet;
        }

        @Override
        public String toString() {
            return "Código: " + codigo + ", Nombre: " + nombre + ", Carnet: " + carnet;
        }
    }

    public static void main(String[] args) {
        // Crear una lista de tipo LinkedList
        LinkedList<Alumno> listaAlumnos = new LinkedList<>();

        // Insertar valores en la lista
        listaAlumnos.add(new Alumno("001", "Ana García", "C001"));
        listaAlumnos.add(new Alumno("002", "Luis Pérez", "C002"));
        listaAlumnos.add(new Alumno("003", "María López", "C003"));

        // Mostrar los valores en pantalla
        System.out.println("=== Lista de Alumnos ===");
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }
    }

}
