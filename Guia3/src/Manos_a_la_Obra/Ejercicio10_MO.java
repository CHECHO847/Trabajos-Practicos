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
public class Ejercicio10_MO {
    public static void main (String[] args){
        int cont=0;
        Scanner leer=new Scanner(System.in);
       do{ 
        System.out.println("");
        System.out.println("Ingrese un numero");
        int num= leer.nextInt();
        if (num>0 && num<=20){
            System.out.print(num);
            for (int i=0; i<num; i++){
            System.out.print("*");
            System.out.print("");
        }
        }
            cont=cont+1;
        
        }while (cont != 4);
   }
}
