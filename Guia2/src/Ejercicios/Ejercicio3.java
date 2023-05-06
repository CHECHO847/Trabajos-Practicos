/*
 *Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author G5
 */
public class Ejercicio3 {
    public static void main (String[] args){
     String frase, may, min;
     Scanner leer=new Scanner(System.in);
     System.out.println("Ingrese una frase");
     frase= leer.next();
     may= frase.toLowerCase();
     min= frase.toUpperCase();
     System.out.println(may);
     System.out.println(min);
    }
}
