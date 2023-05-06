/*
 * Se dispone de un conjunto de N familias, cada una de las cuales tiene
una M cantidad de hijos. Escriba un programa que pida la cantidad de
familias y para cada familia la cantidad de hijos para averiguar la media
de edad de los hijos de todas las familias.
 */
package Ejercicios_Extras;

import java.util.Scanner;

/**
 *
 * @author G5
 */
public class Ejercicio14 {
    public static void main(String[] args){
        double cont=0, suma=0, cont1=0, conthijos=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Familias");
        int num=leer.nextInt();
        while (cont<num){
            System.out.println("Ingrese cantidad de Hijos x Familia");            
            int num1=leer.nextInt();
            cont1=0;
            while(cont1<num1){
                System.out.println("Ingrese edades de los Hijos");            
                    int num2=leer.nextInt();
                    suma=suma+num2;
                    cont1=cont1+1;
                    conthijos=conthijos+1;
            }
            
            cont=cont+1;
        }
        double promedio=(suma/conthijos);
        System.out.println("La media de las edades es:" + promedio);
    }
}