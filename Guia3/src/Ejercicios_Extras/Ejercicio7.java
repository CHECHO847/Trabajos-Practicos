/*
 * Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.
 */
package Ejercicios_Extras;

import java.util.Scanner;

/**
 *
 * @author G5
 */
public class Ejercicio7 {
    public static void main(String[] args){
       int cont=0, may=0,men=0,contg=0;
       double promedio=0;
       Scanner leer=new Scanner(System.in);
       System.out.println("Ingrese la cantidad de numeros a ingresar");
       int num=leer.nextInt();
       while(num>contg){
           System.out.println("Ingrese un valor");
           int num1=leer.nextInt();
           if (contg==0){
               may=num1;
               men=num1;
           }   
            if(num1>may){
                may=num1;
              }
           if (num1<men){
               men=num1;
             }
           cont=cont+num1;
           contg=contg+1;
        }
        promedio=cont/contg;
        System.out.println("El numero mayor es: "+ may);
        System.out.println("El numero menor es: "+ men);
        System.out.println("El promedio de numero ingresados es "+ promedio);
        
    }
}
