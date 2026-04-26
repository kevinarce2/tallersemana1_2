package T1.Herencia_y_polimorfismo;

public class Estudiante extends Persona {
    private String carrera;
    private int semestre;
    private double promedio;

    public Estudiante(String nombre, int edad, String dni, String carrera, int semestre, double promedio) {
        super(nombre, edad, dni); // Llamar al constructor de Persona
        this.carrera = carrera;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    // Sobrescribir método (polimorfismo)
    @Override
    public void mostrarInformacion() {
        System.out.println("=== INFORMACIÓN DE ESTUDIANTE ===");
        super.mostrarInformacion(); // Reutilizar código de la clase padre
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre);
        System.out.println("Promedio: " + promedio);
        System.out.println("=================================");
    }

    // Método específico de Estudiante
    public String getEstado() {
        if (promedio >= 14.0) {
            return "APROBADO";
        } else {
            return "DESAPROBADO";
        }
    }
}
