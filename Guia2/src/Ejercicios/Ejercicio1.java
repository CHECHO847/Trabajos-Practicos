/*
 * Escribir un programa que pida dos números enteros por teclado y calcule
 * la suma de los dos. El programa deberá después mostrar el resultado de
 * la suma
 */
package Ejercicios;

import java.util.Scanner;

 
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code, application logic here
         Scanner leer=new Scanner(System.in);
         System.out. println("Ingrese primer valor");
         int num=leer.nextInt();
         System.out. println("Ingrese segundo valor");
         int num1 =leer.nextInt();
         int resultado= num + num1;
         System.out.println("El resultado de la suma es:_" + resultado);
           
    }
    
}
