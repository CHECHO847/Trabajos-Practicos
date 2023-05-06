/*Imagina que tienes una lista de empleados en una pequeña empresa, y deseas 
calcular su salario promedio y saber cuáles empleados tienen un salario 
superior al promedio. 
Para hacer esto, debes crear un objeto de tipo Empleado, cuyos atributos serán 
el nombre y el salario (que representa el salario mensual del empleado). La 
empresa cuenta con solamente 6 empleados, por lo que deberás crear los 6 
objetos Empleado con sus respectivos salarios. 
Una vez creados los empleados, deberás guardarlos en un arreglo de objetos 
tipo Empleado. Utilizando ese arreglo, tendrás que realizar las dos tareas que 
te piden: 
1. Calcular y mostrar el salario promedio de todos los empleados. 
2. Retornar otro arreglo con los nombres de los empleados que tienen un 
salario mayor al promedio. 
Finalmente, debes mostrar todos los empleados con un salario superior al 
promedio. 
Recuerda que para crear un vector de objetos, la definición es la siguiente: 
Objeto nombreVector[] = new Objeto[]
 */
package integrador;

import integrador.Empleado.Empleado;
import java.util.Scanner;

/**
 *
 * @author G5
 */
public class Integrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado[] personal = new Empleado[6];
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        for (int i = 0; i < personal.length; i++) {
            System.out.println("Ingrese el Nombre y Apellido");
            String nombre = leer.next();
            System.out.println("Ingrese Sueldo");
            double salario = leer.nextInt();
            personal[i] = new Empleado(nombre, salario);
        }
        int remun = 0;
        double promedio = 0;
        for (int i = 0; i < personal.length; i++) {
            remun += personal[i].getSalario();
        }
        promedio = remun / personal.length;
        System.out.println("El sueldo promedio es: " + promedio);

        String[] nombre = new String[6];
        int cont = 0;
        for (int i = 0; i < nombre.length; i++) {
            if (personal[i].getSalario() > promedio) {
                nombre[cont] = personal[i].getNombre();
                System.out.println("El empleado  " + nombre[cont] + " tiene un salario superior al promedio");
                cont++;
            }
        }
    }
}
