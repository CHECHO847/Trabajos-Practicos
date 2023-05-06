/*
 * Escribir un programa que lea un número entero y devuelva el número de
dígitos que componen ese número. Por ejemplo, si introducimos el
número 12345, el programa deberá devolver 5. Calcular la cantidad de
dígitos matemáticamente utilizando el operador de división. Nota:
recordar que las variables de tipo entero truncan los números o
resultados.
 */
package Ejercicios_Extras;

import java.util.Scanner;

/**
 *
 * @author G5
 */
public class Ejercicio11 {
    public static void main(String[] args){
        int cont=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num=leer.nextInt();
        while (num>=1){
            num=num/10;
            cont=cont+1;
        }
        System.out.println("El numero ingresado tiene: "+ cont + " digitos");
        
        
        
        
        
        
        
        
        
    }
}
