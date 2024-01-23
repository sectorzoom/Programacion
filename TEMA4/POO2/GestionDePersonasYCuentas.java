package POO2;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionDePersonasYCuentas {
    public static void main(String[] args) {
        PruebaCuentas menu = new PruebaCuentas();
    }

    public static class Cuenta {
        private double saldoDisponible;

        public Cuenta(String numeroCuenta, double saldoInicial) {
            this.saldoDisponible = saldoInicial;
        }

        public double consultarSaldo() {
            return saldoDisponible;
        }

        public void recibirAbono(double monto) {
            saldoDisponible += monto;
        }

        public void pagarRecibo(double monto) {
            if (monto <= saldoDisponible) {
                saldoDisponible -= monto;
                System.out.println("Recibo pagado. Saldo restante: " + saldoDisponible);
            } else {
                System.out.println("Saldo insuficiente para pagar el recibo.");
            }
        }
    }

    public static class Persona {
        private final ArrayList<Cuenta> cuentas;
        public Persona(String dni) {
            this.cuentas = new ArrayList<>();
        }

        public void agregarCuenta(Cuenta cuenta) {
            if (cuentas.size() < 3) {
                cuentas.add(cuenta);
                System.out.println("Cuenta agregada correctamente.");
            } else {
                System.out.println("No se pueden agregar más cuentas. Máximo alcanzado.");
            }
        }

        public boolean esMorosa() {
            for (Cuenta cuenta : cuentas) {
                if (cuenta.consultarSaldo() < 0) {
                    return true;
                }
            }
            return false;
        }

    }

    public static class PruebaCuentas {
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        boolean option = true;
        while (option) {
            System.out.println("""
                    1. Instanciar objetos de tipo Persona
                    2. Instanciar objetos de tipo Cuenta y asociarlo a una persona.
                    3. Mostrar datos de una persona (por su dni).
                    4. Recibir la nómina mensual de una persona (por dni y núm de cuenta).
                    5. Recibir un pago (por dni y núm de cuenta).
                    6. Realizar transferencia entre cuentas.
                    7. Imprimir las personas morosas.
                    """);
            System.out.print("Indique aquí su elección:");
            int election = scanner.next().charAt(0);
            switch (election) {
                case 1:
                    System.out.println("Pulsa enter para continuar");
                    sc.nextLine();
                    break;
                case 2:
                    System.out.println("Pulsa enter para continuar");
                    sc.nextLine();
                    break;
                case 3:
                    System.out.println("Pulsa enter para continuar");
                    sc.nextLine();
                    break;
                case 4:
                    System.out.println("Pulsa enter para continuar");
                    sc.nextLine();
                    break;
                case 5:
                    System.out.println("Pulsa enter para continuar");
                    sc.nextLine();
                    break;
                case 6:
                    System.out.println("Pulsa enter para continuar");
                    sc.nextLine();
                    break;
                case 7:
                    System.out.println("Pulsa enter para continuar");
                    sc.nextLine();
                    break;
                case 8:
                    option = false;
                    break;
                default:
                    System.out.println("Introduce un valor correcto");
            }
        }
    }

}




