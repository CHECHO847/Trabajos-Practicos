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
package guia.pkg9_ejercicio4.Servicio;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author G5
 */
public class FechaService {
    Scanner leer=new Scanner(System.in);

    public Date fechaNacimiento(){
        System.out.println("Ingrese el dia de su nacimiento");
        int num= leer.nextInt();
        System.out.println("Ingrese el mes de su nacimiento");
        int num1=leer.nextInt();
        System.out.println("Ingrese el año de su nacimiento");
        int num2=leer.nextInt();
        Date nueva=new Date(num2-1900,num1-1,num);
        return nueva;
    }
        
    public Date fechaActual(){
        Date fechaActual=new Date();
        return fechaActual;
    }
    
    public int diferencia(Date a, Date b){
        return  (b.getYear()-a.getYear());
    }
}
