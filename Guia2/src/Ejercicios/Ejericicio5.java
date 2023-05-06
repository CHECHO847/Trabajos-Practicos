/*
 *Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().
 */
package Ejercicios;

import java.util.Scanner;


/**
 *
 * @author G5
 */
public class Ejericicio5 {
    public static void main(String [] args){
      double raiz;
      Scanner leer=new Scanner(System.in);  
      System.out.println("Ingrese un numero");
      int num= leer.nextInt();
      raiz =Math.sqrt(num);
      System.out.println("El doble del valor ingresado es: " + num*2);
      System.out.println("El triple del valor ingresado es: "+ num*3);
      System.out.println("La raiz cuadrada del numero ingresado es: "+ raiz);
    }
}
