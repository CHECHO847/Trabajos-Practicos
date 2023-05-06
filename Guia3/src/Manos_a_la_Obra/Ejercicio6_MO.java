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
public class Ejercicio6_MO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num,num1;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese dos valores");
        num= leer.nextInt();
        num1= leer.nextInt();
        if (num>25 && num1>25){        
            System.out.println("Ambos numetos son mayor de 25");
        }else if (num>25){
                System.out.println("El primer valor es mayor de 25");
        }else if (num1>25){
            System.out.println("El segundo valor es mayor de 25");
         }else{
            System.out.println("Ninguno de los valores es mayor a 25");
        }
     }
}
