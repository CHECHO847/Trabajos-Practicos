/*
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String.
 */
package Ejercicios_Extras;

import java.util.Scanner;

/**
 *
 * @author G5
 */
public class Ejercicio3 {
    public static void main(String[]  args){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una vocal");
        String vocal=leer.nextLine().toUpperCase();
        if (vocal.equals("A")|| vocal.equals("E")|| vocal.equals("I")|| vocal.equals("O")||vocal.equals("U")){
            System.out.println("La letra es una vocal");
        }else{
            System.out.println("La letra es una consonante");
        }
    }
}
