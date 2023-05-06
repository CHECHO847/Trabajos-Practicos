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
public class Ejercicio8_MO {
    public static void main(String[] args){
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese una nota");
        int nota= leer.nextInt();
       while (nota<0 || nota>10){
        System.out.println("Ingrese nuevamente la nota");
        nota= leer.nextInt();
        }
   System.out.println("La nota ingresada es correcta");
    }
}
