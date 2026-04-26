package T1.Herencia_y_polimorfismo;

public class HerenciaPolimorfismo {
    public static void main(String[] args) {
        System.out.println("CASO 4: HERENCIA Y POLIMORFISMO\n");

        // Crear objetos de diferentes clases
        Estudiante est1 = new Estudiante(
                "María González", 21, "72345678",
                "Ingeniería de Sistemas", 6, 15.5);

        Estudiante est2 = new Estudiante(
                "Pedro Sánchez", 20, "71234567",
                "Administración", 4, 12.8);

        Docente doc1 = new Docente(
                "Dr. Carlos Ruiz", 45, "40123456",
                "Programación Orientada a Objetos", 15, "Principal");

        Docente doc2 = new Docente(
                "Ing. Ana Fernández", 38, "42567890",
                "Base de Datos", 10, "Asociado");

        // Demostrar polimorfismo
        System.out.println("--- DEMOSTRACIÓN DE POLIMORFISMO ---\n");

        // Arreglo polimórfico: diferentes tipos en un mismo arreglo
        Persona[] personas = { est1, est2, doc1, doc2 };

        for (Persona p : personas) {
            p.mostrarInformacion(); // Cada objeto ejecuta SU propia versión del método
            System.out.println();
        }

        // Usar métodos específicos
        System.out.println("--- MÉTODOS ESPECÍFICOS ---\n");
        System.out.println(est1.getNombre() + " - Estado: " + est1.getEstado());
        System.out.println(est2.getNombre() + " - Estado: " + est2.getEstado());
        System.out.println(doc1.getNombre() + " - Bonificación: S/. " + doc1.calcularBonificacion());
        System.out.println(doc2.getNombre() + " - Bonificación: S/. " + doc2.calcularBonificacion());

    }
}
