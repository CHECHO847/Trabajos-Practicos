/*
 * Realizar un programa que solo permita introducir solo frases o palabras
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
función Lenght() en Java
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author G5
 */
public class Ejercicio3 {
  public static void main(String[] args){
      int largo;
      Scanner leer=new Scanner(System.in);
      System.out.println("Ingrese una frase");
      String frase=leer.nextLine().toUpperCase();
      largo=frase.length();
      if (largo==8){
          System.out.println("CORRECTO");
      }else{
          System.out.println("INCORRECTO");
      }
      
      
  }    
    
    
    
    
    
}
