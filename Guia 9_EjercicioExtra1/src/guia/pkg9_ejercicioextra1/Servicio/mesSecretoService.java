/*Crea una clase en Java donde declares una variable de tipo array de
Strings que contenga los doce meses del año, en minúsculas. A
continuación, declara una variable mesSecreto de tipo String, y hazla
igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario
acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. Un ejemplo de ejecución del programa podría
ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:
febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 * 
 */
package guia.pkg9_ejercicioextra1.Servicio;

import java.util.Scanner;

/**
 *
 * @author G5
 */
public class mesSecretoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    String [] meses= {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","setiembre","octubre","noviembre","diciembre"};
       
    String mesSecreto= meses[9];   
       
    public void adivine(){
        System.out.println("Adivine el mes Secreto");
        System.out.println("Ingrese el mes");
        String adivina=leer.next().toLowerCase();
        while (!adivina.equals(mesSecreto)){
            System.out.println("No ha acertado");
            System.out.println("Intente nuevamente");
            System.out.println("Ingrese el mes");
            adivina=leer.next().toLowerCase();
        }
        System.out.println("¡Ha acertado!");
    }
    
    
    
    
    
    
    
}
