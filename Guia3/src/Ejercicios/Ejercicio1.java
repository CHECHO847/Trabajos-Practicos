/*
 *Crear un programa que dado un número determine si es par o impar.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author G5
 */
public class Ejercicio1 {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un valor");
        int num=leer.nextInt();
        if (num%2==0){
            System.out.println("El numero ingresado es par");
        }else{
            System.out.println("El numer ingresado es impar");        
        }
   }
}