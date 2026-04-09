class Operacion {

    public int sumar(int a, int b) {
        System.out.println("Sumando dos enteros...");
        return a + b;
    }

    public double sumar(double a, double b) {
        System.out.println("Sumando dos decimales...");
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        System.out.println("Sumando tres enteros...");
        return a + b + c;
    }

    public int sumar(int a, int b, int c, int d) {
        System.out.println("Sumando cuatro enteros...");
        return a + b + c + d;
    }
}

public class Caso3_Sobrecarga {
    public static void main(String[] args) {
        System.out.println("=== SOBRECARGA DE MÉTODOS ===\n");

        Operacion op = new Operacion();

        int resultado1 = op.sumar(5, 3);
        System.out.println("Resultado: " + resultado1);
        System.out.println();

        double resultado2 = op.sumar(5.5, 3.2);
        System.out.println("Resultado: " + resultado2);
        System.out.println();

        int resultado3 = op.sumar(5, 3, 2);
        System.out.println("Resultado: " + resultado3);
        System.out.println();

        int resultado4 = op.sumar(10, 20, 30, 40);
        System.out.println("Resultado: " + resultado4);
        System.out.println();

        System.out.println("=== JAVA ELIGE EL MÉTODO AUTOMÁTICAMENTE ===");
        System.out.println("op.sumar(1, 2) → " + op.sumar(1, 2));
        System.out.println("op.sumar(1.0, 2.0) → " + op.sumar(1.0, 2.0));
        System.out.println("op.sumar(1, 2, 3) → " + op.sumar(1, 2, 3));
    }
}
