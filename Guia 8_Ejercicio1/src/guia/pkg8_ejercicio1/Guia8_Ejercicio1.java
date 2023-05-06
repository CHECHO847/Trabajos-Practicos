/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg8_ejercicio1;

import guia.pkg8_ejercicio1.Entidad.CuentaBancaria;
import guia.pkg8_ejercicio1.Servicio.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author G5
 */
public class Guia8_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        CuentaBancariaServicio nuevo = new CuentaBancariaServicio();
        CuentaBancaria banco = nuevo.crearCuenta();
        do {
            System.out.println("Menu de acceso");
            System.out.println("1 - Ingreso de Dinero");
            System.out.println("2 - Retiro de Dinero");
            System.out.println("3 - Extraccion Rapida");
            System.out.println("4 - Consulta de Saldo");
            System.out.println("5 - Consulta de Datos");
            System.out.println("6 - Salir del sistema");

            System.out.println("Ingrese la opcion deseada");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    nuevo.Ingresar(banco);
                    break;
                case 2:
                    nuevo.Retirar(banco);
                    break;
                case 3:
                    nuevo.extraccionRapida(banco);
                    break;
                case 4:
                    nuevo.consultarSaldo(banco);
                    break;
                case 5:
                    nuevo.consultarDatos(banco);
                    break;
                case 6:
                    System.out.println("Esta saliendo del Sistema");
                    opcion = 0;
                    break;
                default:
                    System.out.println("La opcion elegida no es valida");
            }
        } while (opcion != 0);

    }

}
