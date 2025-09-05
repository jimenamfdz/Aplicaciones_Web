import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el número de cuenta: ");
        String cuenta = scanner.nextLine();

        double saldo = 0.0;
        boolean ejecutando = true;

        while (ejecutando) {
            System.out.println("\nElija una opción:");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el monto a depositar: ");
                    double montoDeposito = scanner.nextDouble();
                    Depositar deposito = new Depositar(montoDeposito);
                    saldo = deposito.ejecutar(saldo);
                    break;
                case 2:
                    System.out.print("Ingrese el monto a retirar: ");
                    double montoRetiro = scanner.nextDouble();
                    Retirar retiro = new Retirar(montoRetiro);
                    saldo = retiro.ejecutar(saldo);
                    break;
                case 3:
                    Consultar consulta = new Consultar(nombre, cuenta, saldo);
                    consulta.ejecutar();
                    break;
                case 4:
                    ejecutando = false;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
        scanner.close();
    }
}
