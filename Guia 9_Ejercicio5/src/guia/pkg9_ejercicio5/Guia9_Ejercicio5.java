/*Implemente la clase Persona en el paquete entidades. Una persona tiene
un nombre y una fecha de nacimiento (Tipo Date), constructor vacío,
constructor parametrizado, get y set. Crear una clase PersonaService,
en el paquete servicio, con los siguientes métodos:
a) Método crearPersona que pida al usuario Nombre y fecha de
nacimiento de la persona a crear. Retornar el objeto Persona creado.
b) Método calcularEdad que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.
c) Método menorQue recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario.
d) Método mostrarPersona que muestra la información de la persona
deseada.

 * 
 */
package guia.pkg9_ejercicio5;

import guia.pkg9_ejercicio5.Entidad.Persona;
import guia.pkg9_ejercicio5.Servicio.PersonaService;
import java.util.Scanner;

/**
 *
 * @author G5
 */
public class Guia9_Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        PersonaService pers=new PersonaService();
        Persona nueva=pers.crearPersona();
        System.out.println("Ingrese una edad a comparar");
        int edad=leer.nextInt();
        System.out.println(pers.menor(nueva, edad));
        pers.mostrarPersona(nueva);
    }
}
