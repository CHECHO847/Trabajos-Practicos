/* Realizar una clase llamada ParDeNumeros que tenga como atributos dos
números reales con los cuales se realizarán diferentes operaciones
matemáticas. La clase debe tener un constructor vacío, getters y setters.
En el constructor vacío se usará el Math.random para generar los dos
números. Crear una clase ParDeNumerosService, en el paquete
Servicios, que deberá además implementar los siguientes métodos:
a) Método mostrarValores que muestra cuáles son los dos números
guardados.
b) Método devolverMayor para retornar cuál de los dos atributos tiene
el mayor valor
c) Método calcularPotencia para calcular la potencia del mayor valor de
la clase elevado al menor número. Previamente se deben redondear
ambos valores.
d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
dos valores. Antes de calcular la raíz cuadrada se debe obtener el
valor absoluto del número.
*/
package guia.pkg9_ejercicio2.Servicio;

import guia.pkg9_ejercicio2.Entidad.ParDeNumeros;

/**
 *
 * @author G5
 */
public class ParDeNumerosService {
    
    public static void mostrarValores (ParDeNumeros dato){
        System.out.println(dato.getNum());
        System.out.println(dato.getNum1());
    }
    
    public static void devolverMayor (ParDeNumeros dato){
         double mayor=Math.max(dato.getNum(),dato.getNum1());
         System.out.println("El numero mayor es: " + mayor);
    }
    
    public static void calcularPotencia(ParDeNumeros dato){
        double mayor=Math.max(dato.getNum(),dato.getNum1());
        double menor=Math.min(dato.getNum(),dato.getNum1());
        System.out.println("La potencia es: " + Math.round( Math.pow(mayor,menor)));
    }
    
    public static void calcularRaiz(ParDeNumeros dato){
        double menor=Math.min(dato.getNum(),dato.getNum1());
        System.out.println("La raiz del menor valor es: "+ Math.sqrt(Math.abs(menor)));
         
    }    
}



