/*
 *  2.Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package Ejercicios_Extras;

import java.util.Scanner;

/**
 *
 * @author G5
 */
public class Ejercicio12_1 {
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                
                    if (i == 3) {
                        String converI = String.valueOf(i);
                        converI = "E";
                        System.out.print(converI);
                    } else {
                        System.out.print(i);
                    }
                    if (j == 3) {
                        String converJ = String.valueOf(j);
                        converJ = "-E-";
                        System.out.print(converJ);
                    } else {
                        System.out.print("-"+j+"-");
                    }
                    if (k == 3) {
                        String converK = String.valueOf(k);
                        converK = "E";
                        System.out.print(converK);
                    } else {
                        System.out.print(k);
                    }
                    System.out.println(" ");
                }

            }

        }
}
}