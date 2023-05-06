/*
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author G5
 */
public class Ejercicio2 {
      public static void main(String[] args) {
      String nombre;
      Scanner leer=new Scanner(System.in);
      System.out.println("Ingrese su nombre");
      nombre= leer.next();
      System.out.println("Bienvenido "+nombre);   
         
      }
}
