import java.util.Scanner;

/**
 * CASO 1: Calculadora básica
 * Permite realizar operaciones básicas entre dos números
 */
public class Caso1_Calculadora {

    // Método para sumar
    public static double sumar(double a, double b) {
        return a + b;
    }

    // Método para restar
    public static double restar(double a, double b) {
        return a - b;
    }

    // Método para multiplicar
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Método para dividir
    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre cero");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CALCULADORA BÁSICA ===");
        
        // Ingresar números
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        
        // Mostrar menú de operaciones
        System.out.println("\nSeleccione una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();
        
        double resultado = 0;
        
        // Usar switch para elegir la operación
        switch (opcion) {
            case 1:
                resultado = sumar(num1, num2);
                System.out.println("\nResultado: " + num1 + " + " + num2 + " = " + resultado);
                break;
            case 2:
                resultado = restar(num1, num2);
                System.out.println("\nResultado: " + num1 + " - " + num2 + " = " + resultado);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                System.out.println("\nResultado: " + num1 " × " + num2 + " = " + resultado);
                break;
            case 4:
                resultado = dividir(num1, num2);
                if (num2 != 0) {
                    System.out.println("\nResultado: " + num1 + " ÷ " + num2 + " = " + resultado);
                }
                break;
            default:
                System.out.println("\nOpción inválida");
        }
        
        scanner.close();
    }
}
