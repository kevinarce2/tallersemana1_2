package T1.Herencia_y_polimorfismo;

public class Persona {
    protected String nombre;
    protected int edad;
    protected String dni;

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    // Método a sobrescribir (polimorfismo)
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("DNI: " + dni);
    }

    public String getNombre() {
        return nombre;
    }
}
