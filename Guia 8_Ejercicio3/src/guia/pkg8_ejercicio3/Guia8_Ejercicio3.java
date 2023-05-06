/*A continuación, en la clase main hacer lo siguiente:
● Crear 4 objetos de tipo Persona con distintos valores, a continuación,
llamaremos todos los métodos para cada objeto, deberá comprobar si la
persona está en su peso ideal, tiene sobrepeso o está por debajo de su
peso ideal e indicar para cada objeto si la persona es mayor de edad.
● Por último, guardaremos los resultados de los métodos calcularIMC y
esMayorDeEdad en distintas variables(arrays), para después calcular un
porcentaje de esas 4 personas cuantas están por debajo de su peso,
cuantas en su peso ideal y cuantos, por encima, y también calcularemos
un porcentaje de cuantos son mayores de edad y cuantos menores. Para
esto, podemos crear unos métodos adicionales


 */
package guia.pkg8_ejercicio3;


import guia.pkg8_ejercicio3.Entidad.Persona;
import guia.pkg8_ejercicio3.Servicio.PersonaServicio;

/**
 *
 * @author G5
 */
public class Guia8_Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio persona=new PersonaServicio();
        boolean [] mayoredad= new boolean[2];
        int [] calcularIMC=new int[2];
        Persona p1= persona.crearPersona();
        mayoredad[0]=persona.MayordeEdad(p1);
        calcularIMC[0]=persona.calcularIMC(p1);
        Persona p2= persona.crearPersona();
        mayoredad[1]=persona.MayordeEdad(p2);
        calcularIMC[1]=persona.calcularIMC(p2);
        Persona p3= persona.crearPersona();
        persona.MayordeEdad(p3);
        persona.calcularIMC(p3);
        mayoredad[2]=persona.MayordeEdad(p3);
        calcularIMC[2]=persona.calcularIMC(p3);
        Persona p4= persona.crearPersona();       
        persona.MayordeEdad(p4);
        persona.calcularIMC(p4);
        mayoredad[3]=persona.MayordeEdad(p4);
        calcularIMC[3]=persona.calcularIMC(p4);
        
       persona.porcentajeEdad(mayoredad);
       persona.porcentajeIMc(calcularIMC);
        
        
    }
    
}
