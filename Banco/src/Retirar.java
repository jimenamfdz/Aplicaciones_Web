public class Retirar {
    private double monto;

    public Retirar(double monto) {
        this.monto = monto;
    }

    public double ejecutar(double saldoActual) {
        System.out.println("Saldo actual: $" + saldoActual);
        if (monto > 0 && monto <= saldoActual) {
            double nuevoSaldo = saldoActual - monto;
            System.out.println("Retiro exitoso. Saldo restante: $" + nuevoSaldo);
            return nuevoSaldo;
        } else {
            System.out.println("Monto de retiro inválido.");
            return saldoActual;
        }
    }
}
