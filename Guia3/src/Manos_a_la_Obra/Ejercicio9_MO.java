/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manos_a_la_Obra;

import java.util.Scanner;

/**
 *
 * @author G5
 */
public class Ejercicio9_MO {
    public static void main(String[] args){
        int num, suma, contador;
        Scanner leer=new Scanner(System.in);
        suma=0;
        contador=0;
        do{
            System.out.println("Escribir un numero");
            num= leer.nextInt();
            if (num>0){
                suma=suma+num;
            }  
            contador=contador+1;
        }while (num!=0 && contador<21); 
        System.out.println("Se capturo el numero cero");
        System.out.println("La suma de los numeros es: "+ suma);
    }
}