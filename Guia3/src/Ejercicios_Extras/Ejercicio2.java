/*
 * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package Ejercicios_Extras;

import java.util.Scanner;

/**
 *
 * @author G5
 */
public class Ejercicio2 {
    public static void main(String [] args){
        int A=12, B=11, C=10, D=8, E=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("A"+"="+ A);
        System.out.println("B"+"="+ B);
        System.out.println("C"+"="+ C);
        System.out.println("D"+"="+ D);
        System.out.println("");
        System.out.println("A"+"="+ (E=D));
        System.out.println("B"+"="+ (E=C));
        System.out.println("C"+"="+ (E=A));
        System.out.println("D"+"="+ (E=B));
    }
}
