/*
Agregar la clase CuentaBancariaServicio en el paquete Servicios que
contenga:
a) Método para crear cuenta pidiéndole los datos al usuario.
b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
se le sumará al saldo actual.
c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
retirar se retirará el máximo posible hasta dejar la cuenta en 0.
d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20%.
e) Método consultarSaldo: permitirá consultar el saldo disponible en la
cuenta.
f) Método consultarDatos: permitirá mostrar todos los datos de la
cuenta.
 */
package guia.pkg8_ejercicio1.Servicio;

import guia.pkg8_ejercicio1.Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author G5
 */
public class CuentaBancariaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public CuentaBancaria crearCuenta() {
        System.out.println("Ingrese su numero de Cuenta");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese el D.N.I.");
        long dni = leer.nextLong();
        System.out.println("Ingrese Saldo Actual");
        double saldoActual = leer.nextDouble();

        return new CuentaBancaria(numeroCuenta, dni, saldoActual);
    }

    public void Ingresar(CuentaBancaria banco) {
        System.out.println("Ingrese el monto a depositar");
        double deposito = leer.nextDouble();
        banco.setSaldoActual(banco.getSaldoActual() + deposito);
    }

    public void Retirar(CuentaBancaria banco) {
        System.out.println("Ingrese el monto a retirar");
        double retiro = leer.nextDouble();

        if (retiro > banco.getSaldoActual()) {
            System.out.println("El monto ingresado supera su saldo");
        } else {
            banco.setSaldoActual(banco.getSaldoActual() - retiro);
        }
    }

    public void extraccionRapida(CuentaBancaria banco) {
        System.out.println("Recuerde que esta opcion permite retirar el 20% de su saldo");
        double retiro1 = leer.nextDouble();
        if (retiro1 > banco.getSaldoActual() * 20 / 100) {
            System.out.println("El monto supera el limite para esta operacion");
        } else {
            banco.setSaldoActual(banco.getSaldoActual() - retiro1);
        }
    }

    public void consultarSaldo(CuentaBancaria banco) {
        System.out.println("Su saldo actual es " + banco.getSaldoActual());
    }

    public void consultarDatos(CuentaBancaria banco) {
        System.out.println("D.N.I.: " + banco.getDniCliente());
        System.out.println("Numero de Cuenta: " + banco.getNumeroCuenta());
    }
}
