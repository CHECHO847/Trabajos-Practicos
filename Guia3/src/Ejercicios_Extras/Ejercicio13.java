/*
 * Crear un programa que dibuje una escalera de números, donde cada
línea de números comience en uno y termine en el número de la línea.
Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se
ingresa el número 3:
1
12
123

 */
package Ejercicios_Extras;

import java.util.Scanner;

/**
 *
 * @author G5
 */
public class Ejercicio13 {
    
        public static void main(String[] args){
            int num,i,j;
            Scanner leer=new Scanner(System.in);
            System.out.println("Ingrese la altura de la escalera");
            num=leer.nextInt();
            for(i=0;i<num+1;i++){
               for (j=0;j<i; j++){
                System.out.print(j+1);
                }
                System.out.println();
            }   
        }    
            
    }

