/*
 * Escriba un programa en el cual se ingrese un valor limite positivo, y a
continuacio solicite numeros al usuario hasta que la suma de los
numeros introducidos supere el límite inicial.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author G524
 * 
 */
public class Ejercicio5 {
    public static void main(String[] args){
        int suma=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el valor Limite");
        int num=leer.nextInt();
        if (num>0){
        while(num>=suma){
          System.out.println("ingrese un valor");
           int num1=leer.nextInt();
           suma=suma+num1;
        }
        }else{
        System.out.println("El valor ingresado no es valido");
    }
    } 
}


