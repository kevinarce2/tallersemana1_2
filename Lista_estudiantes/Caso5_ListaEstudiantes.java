import java.util.ArrayList;
import java.util.Scanner;

public class Caso5_ListaEstudiantes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> estudiantes = new ArrayList<>();

        System.out.println("=== GESTIÓN DE ESTUDIANTES ===\n");

        boolean continuar = true;

        while (continuar) {
            try {
                System.out.println("\n--- MENÚ ---");
                System.out.println("1. Agregar estudiante");
                System.out.println("2. Mostrar lista de estudiantes");
                System.out.println("3. Eliminar estudiante");
                System.out.println("4. Buscar estudiante");
                System.out.println("5. Contar estudiantes");
                System.out.println("6. Salir");
                System.out.print("Seleccione una opción: ");

                int opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer

                switch (opcion) {
                    case 1:
                        agregarEstudiante(scanner, estudiantes);
                        break;
                    case 2:
                        mostrarEstudiantes(estudiantes);
                        break;
                    case 3:
                        eliminarEstudiante(scanner, estudiantes);
                        break;
                    case 4:
                        buscarEstudiante(scanner, estudiantes);
                        break;
                    case 5:
                        contarEstudiantes(estudiantes);
                        break;
                    case 6:
                        continuar = false;
                        System.out.println("\n¡Hasta luego!");
                        break;
                    default:
                        System.out.println("\n Error: Opción inválida. Intente nuevamente.");
                }

            } catch (java.util.InputMismatchException e) {
                System.out.println("\n Error: Debe ingresar un número válido.");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("\n Error inesperado: " + e.getMessage());
                scanner.nextLine();
            }
        }

        scanner.close();
    }

    public static void agregarEstudiante(Scanner scanner, ArrayList<String> estudiantes) {
        try {
            System.out.print("\nIngrese el nombre del estudiante: ");
            String nombre = scanner.nextLine().trim();

            if (nombre.isEmpty()) {
                System.out.println("Error: El nombre no puede estar vacío.");
                return;
            }

            if (nombre.matches(".*\\d.*")) {
                System.out.println("Error: El nombre no debe contener números.");
                return;
            }

            estudiantes.add(nombre);
            System.out.println("Estudiante '" + nombre + "' agregado correctamente.");

        } catch (Exception e) {
            System.out.println("Error al agregar estudiante: " + e.getMessage());
        }
    }

    public static void mostrarEstudiantes(ArrayList<String> estudiantes) {
        System.out.println("\n--- LISTA DE ESTUDIANTES ---");

        if (estudiantes.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            for (int i = 0; i < estudiantes.size(); i++) {
                System.out.println((i + 1) + ". " + estudiantes.get(i));
            }
            System.out.println("\nTotal: " + estudiantes.size() + " estudiante(s)");
        }
    }

    public static void eliminarEstudiante(Scanner scanner, ArrayList<String> estudiantes) {
        try {
            if (estudiantes.isEmpty()) {
                System.out.println("\n La lista está vacía. No hay estudiantes para eliminar.");
                return;
            }

            mostrarEstudiantes(estudiantes);
            System.out.print("\nIngrese el número del estudiante a eliminar: ");
            int indice = scanner.nextInt() - 1;
            scanner.nextLine();

            if (indice >= 0 && indice < estudiantes.size()) {
                String eliminado = estudiantes.remove(indice);
                System.out.println("✓ Estudiante '" + eliminado + "' eliminado correctamente.");
            } else {
                System.out.println("Error: Número inválido.");
            }

        } catch (java.util.InputMismatchException e) {
            System.out.println(" Error: Debe ingresar un número válido.");
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println(" Error al eliminar estudiante: " + e.getMessage());
        }
    }

    public static void buscarEstudiante(Scanner scanner, ArrayList<String> estudiantes) {
        try {
            System.out.print("\nIngrese el nombre a buscar: ");
            String nombre = scanner.nextLine().trim();

            boolean encontrado = false;
            System.out.println("\n--- RESULTADOS DE BÚSQUEDA ---");

            for (int i = 0; i < estudiantes.size(); i++) {
                if (estudiantes.get(i).toLowerCase().contains(nombre.toLowerCase())) {
                    System.out.println((i + 1) + ". " + estudiantes.get(i));
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("No se encontraron coincidencias.");
            }

        } catch (Exception e) {
            System.out.println("Error al buscar estudiante: " + e.getMessage());
        }
    }

    public static void contarEstudiantes(ArrayList<String> estudiantes) {
        System.out.println("\n--- ESTADÍSTICAS ---");
        System.out.println("Total de estudiantes registrados: " + estudiantes.size());

        if (!estudiantes.isEmpty()) {
            System.out.println("Primer estudiante: " + estudiantes.get(0));
            System.out.println("Último estudiante: " + estudiantes.get(estudiantes.size() - 1));
        }
    }
}
