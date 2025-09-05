public class Consultar {
    private String nombreCliente;
    private String numeroCuenta;
    private double saldo;

    public Consultar(String nombreCliente, String numeroCuenta, double saldo) {
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    
    public void ejecutar() {
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Cuenta: " + numeroCuenta);
        System.out.println("Saldo: $" + saldo);
    }
}
