class Contador {
    private static int contador = 0;

    private int id;
    private String nombre;

    public Contador(String nombre) {
        contador++;
        this.id = contador;
        this.nombre = nombre;
        System.out.println("Objeto '" + nombre + "' creado con ID: " + id);
    }

    public static int getTotalObjetos() {
        return contador;
    }

    public static void reiniciarContador() {
        contador = 0;
        System.out.println("Contador reiniciado");
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id + " | Nombre: " + nombre);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}

public class Caso4_Static {
    public static void main(String[] args) {
        System.out.println("=== USO DE STATIC ===\n");

        System.out.println("Objetos creados inicialmente: " + Contador.getTotalObjetos());
        System.out.println();

        System.out.println("--- Creando objetos ---");
        Contador obj1 = new Contador("Objeto A");
        Contador obj2 = new Contador("Objeto B");
        Contador obj3 = new Contador("Objeto C");
        System.out.println();

        System.out.println("Total de objetos creados: " + Contador.getTotalObjetos());
        System.out.println();

        System.out.println("--- Creando más objetos ---");
        Contador obj4 = new Contador("Objeto D");
        Contador obj5 = new Contador("Objeto E");
        System.out.println();

        System.out.println("Total de objetos creados ahora: " + Contador.getTotalObjetos());
        System.out.println();

        System.out.println("--- Información de objetos ---");
        obj1.mostrarInfo();
        obj2.mostrarInfo();
        obj3.mostrarInfo();
        obj4.mostrarInfo();
        obj5.mostrarInfo();
        System.out.println();

        System.out.println("--- El contador es compartido ---");
        System.out.println("Accediendo desde diferentes objetos:");
        System.out.println("Desde obj1: " + Contador.getTotalObjetos() + " objetos");
        System.out.println("Desde obj3: " + Contador.getTotalObjetos() + " objetos");
        System.out.println("Desde la clase: " + Contador.getTotalObjetos() + " objetos");
    }
}
