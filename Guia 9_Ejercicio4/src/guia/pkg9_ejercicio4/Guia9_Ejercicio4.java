/*Vamos a usar la clase Date que ya existe en Java. Crearemos la clase
FechaService, en paquete Servicios, que tenga los siguientes métodos:
a) Método fechaNacimiento que pregunte al usuario día, mes y año de
su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
new Date(anio, mes, dia);
b) Método fechaActual que cree un objeto fecha con el día actual. Para
esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
fechaActual = new Date();
El método debe retornar el objeto Date.
c) Método diferencia que reciba las dos fechas por parámetro y retorna
la diferencia de años entre una y otra (edad del usuario).
Si necesiten acá tienen más información en clase Date: Documentacion
Oracle
 */
package guia.pkg9_ejercicio4;

import guia.pkg9_ejercicio4.Servicio.FechaService;
import java.util.Date;

/**
 *
 * @author G5
 */
public class Guia9_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FechaService nueva=new FechaService();
        Date fechaNacimiento=nueva.fechaNacimiento();
        Date fechaActual=nueva.fechaActual();
        System.out.println("Usted tiene:" + nueva.diferencia(fechaActual, fechaNacimiento));
    }
}
