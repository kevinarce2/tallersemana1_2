package T1.Herencia_y_polimorfismo;

public class Docente extends Persona {
    private String especialidad;
    private int aniosExperiencia;
    private String categoria;

    public Docente(String nombre, int edad, String dni, String especialidad, int aniosExperiencia, String categoria) {
        super(nombre, edad, dni); // Llamar al constructor de Persona
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
        this.categoria = categoria;
    }

    // Sobrescribir método (polimorfismo)
    @Override
    public void mostrarInformacion() {
        System.out.println("=== INFORMACIÓN DE DOCENTE ===");
        super.mostrarInformacion(); // Reutilizar código de la clase padre
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Años de experiencia: " + aniosExperiencia);
        System.out.println("Categoría: " + categoria);
        System.out.println("==============================");
    }

    // Método específico de Docente
    public double calcularBonificacion() {
        return aniosExperiencia * 200.0;
    }
}