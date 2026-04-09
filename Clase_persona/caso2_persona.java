class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("------------------------");
    }
}

public class Caso2_Persona {
    public static void main(String[] args) {
        System.out.println("=== GESTIÓN DE PERSONAS ===\n");

        Persona persona1 = new Persona("Juan Pérez", 25);

        Persona persona2 = new Persona("María González", 30);

        System.out.println("PERSONA 1:");
        persona1.mostrarDatos();

        System.out.println("PERSONA 2:");
        persona2.mostrarDatos();

        persona1.setEdad(26);
        System.out.println("Después de actualizar edad de " + persona1.getNombre() + ":");
        persona1.mostrarDatos();
    }
}
