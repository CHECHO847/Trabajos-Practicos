/*
 * Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es
3.
¿Aún no lo entendiste? Recomendamos googlear división con restas
sucesivas.
10.Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 1
 */
package Ejercicios_Extras;

import java.util.Scanner;

/**
 *
 * @author G5
 */
public class Ejercicio9 {
    public static void main(String[] args){
        int cont=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese Dividendo");
        int num=leer.nextInt();
        System.out.println("Ingrese Dividendo");
        int num1=leer.nextInt();
        while (num-num1>=0){
            num=num-num1;
            cont=cont+1;
        }
        System.out.println("El cociente es: "+ cont);
        System.out.println("El resto es: " + num);
    }
}

