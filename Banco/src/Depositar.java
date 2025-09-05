public class Depositar {
    private double monto;

    public Depositar(double monto) {
        this.monto = monto;
    }

    public double ejecutar(double saldoActual) {  // 👈 nombre cambiado
        if (monto > 0) {
            double nuevoSaldo = saldoActual + monto;
            System.out.println("Depósito exitoso. Saldo total: $" + nuevoSaldo);
            return nuevoSaldo;
        } else {
            System.out.println("Monto de depósito inválido.");
            return saldoActual;
        }
    }
}

