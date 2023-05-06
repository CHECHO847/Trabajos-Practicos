/*
 * Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
 */
package Ejercicios_Extras;

import java.util.Scanner;

/**
 *
 * @author G5
 */
public class Ejercicio6 {
   public static void main(String[] args){
       double cont=0, cont1=0,cont2=0, cont3=0;
       double prom=0, prom1=0;
       Scanner leer=new Scanner(System.in);
       System.out.println("Ingrese la cantidad de personas a comparar");
       int num = leer.nextInt();
       for(int i=0; i<num;i++){
            System.out.println("Ingrese la altura");
            double num1=leer.nextDouble();
            if (num1<1.60){
               cont=cont+num1;
               cont1=cont1+1;
            }else{
               cont2=cont2+num1;
               cont3=cont3+1;
            }
            
         }
            prom=cont/cont1;  
            prom1=(cont+cont2)/(cont1+cont3);
       System.out.println("El promedio de alturas por debajo de 1,60 es: " + prom);
       System.out.println("El promedio de alturas en general es: " + prom1);
    } 
}
