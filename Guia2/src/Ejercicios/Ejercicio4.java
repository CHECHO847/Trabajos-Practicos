/*
 * Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
*/
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author G5
 */
public class Ejercicio4 {
    public static void main (String[] args){
     Scanner leer=new Scanner(System.in);
     System.out.println("Ingrese grados centigrados");
     double grados= leer.nextDouble();
     double formula= 32+(9*grados/5);
     System.out.println("La equivalencia es grados Fahrenheit "+formula);
    }
}
