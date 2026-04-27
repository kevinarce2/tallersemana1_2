public class Main {
    public static void main(String[] args) {
        try {
            CuentaBancaria cuenta1 = new CuentaBancaria("Ana", 1000);
            CuentaBancaria cuenta2 = new CuentaBancaria("Luis", 500);

            System.out.println("=== ESTADO INICIAL ===");
            System.out.println(cuenta1);
            System.out.println(cuenta2);
            System.out.println("Total de cuentas creadas: " + CuentaBancaria.getContadorCuentas());

            cuenta1.depositar(250);
            cuenta2.retirar(200);

            System.out.println("\n=== DESPUES DE OPERACIONES VALIDAS ===");
            System.out.println(cuenta1);
            System.out.println(cuenta2);

            System.out.println("\n=== PRUEBA DE EXCEPCIONES ===");
            try {
                cuenta1.depositar(-50);
            } catch (MontoInvalidoException e) {
                System.out.println("Error al depositar: " + e.getMessage());
            }

            try {
                cuenta2.retirar(1000);
            } catch (MontoInvalidoException | SaldoInsuficienteException e) {
                System.out.println("Error al retirar: " + e.getMessage());
            }

            System.out.println("\n=== ESTADO FINAL ===");
            System.out.println(cuenta1);
            System.out.println(cuenta2);
            System.out.println("Total de cuentas creadas: " + CuentaBancaria.getContadorCuentas());

        } catch (MontoInvalidoException e) {
            System.out.println("Error al crear cuenta: " + e.getMessage());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Operacion no permitida: " + e.getMessage());
        }
    }
}
