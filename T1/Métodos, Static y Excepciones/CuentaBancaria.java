public class CuentaBancaria {
    private String titular;
    private double saldo;
    private static int contadorCuentas = 0;

    public CuentaBancaria(String titular, double saldoInicial) throws MontoInvalidoException {
        if (titular == null || titular.trim().isEmpty()) {
            throw new MontoInvalidoException("El titular no puede estar vacio.");
        }

        if (saldoInicial < 0) {
            throw new MontoInvalidoException("El saldo inicial no puede ser negativo.");
        }

        this.titular = titular.trim();
        this.saldo = saldoInicial;
        contadorCuentas++;
    }

    public void depositar(double monto) throws MontoInvalidoException {
        if (monto <= 0) {
            throw new MontoInvalidoException("El monto a depositar debe ser mayor a 0.");
        }

        saldo += monto;
    }

    public void retirar(double monto) throws MontoInvalidoException, SaldoInsuficienteException {
        if (monto <= 0) {
            throw new MontoInvalidoException("El monto a retirar debe ser mayor a 0.");
        }

        if (monto > saldo) {
            throw new SaldoInsuficienteException("No hay saldo suficiente para retirar " + monto + ". Saldo actual: " + saldo);
        }

        saldo -= monto;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public static int getContadorCuentas() {
        return contadorCuentas;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{titular='" + titular + "', saldo=" + saldo + "}";
    }
}
