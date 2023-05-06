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
*/
package guia.pkg9_ejercicio5.Servicio;

import guia.pkg9_ejercicio5.Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author G5
 */
public class PersonaService {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        System.out.println("Ingrese su nombre");
        String nombre=leer.next();
        System.out.println("Ingrese el dia de su nacimiento");
        int dia=leer.nextInt();
        System.out.println("Ingrese el mes de su nacimiento");
        int mes=leer.nextInt();
        System.out.println("Ingrese el año de su nacimiento");
        int anio=leer.nextInt();
        Date nueva= new Date(anio-1900,mes-1,dia);
        return new Persona(nombre, nueva);
    }
    
    public int calcularEdad(Persona a){
        Date fechaActual= new Date();
        return fechaActual.getYear()-a.getFechanac().getYear();
    }
    
    public boolean menor(Persona a, int edadC){
        Date fechaActual=new Date();
        int edad=fechaActual.getYear()-a.getFechanac().getYear();
        if (edadC>edad){
            return false;
        }else{
            return true;
        }
    }
    
    public void mostrarPersona(Persona a){
        System.out.println(a.getNombre());
        System.out.println(a.getFechanac());
    }
    
    
    
    
}
