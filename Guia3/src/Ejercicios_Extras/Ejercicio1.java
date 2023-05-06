/*
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
 */
package Ejercicios_Extras;

import java.util.Scanner;

/**
 *
 * @author G5
 */
public class Ejercicio1 {
    public static void main(String[] args){
        int dias, horas;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos");
        int num=leer.nextInt();
        horas=(num/60);
        dias=(horas/24);
        horas=horas % 24;
        System.out.println("Equivale a "+ dias+ " dias "+ horas+ " horas"  );
    }
}
