/*
 * Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package Ejercicios_Extras;

import java.util.Scanner;

/**
 *
 * @author G5
 */
public class Ejercicio10 {
    public static void main(String [] args){
        int num2;
        Scanner leer=new Scanner(System.in);
        int num=(int)(Math.random()*10);
        int num1=(int)(Math.random()*10);
        int res=num*num1;
        do{
        System.out.println("Ingrese el resultados de la multiplicacion");
        num2=leer.nextInt();
        if(res!=num2){
            System.out.println("El valor ingresado es INCORRECTO");
            System.out.println("Intente nuevamente");
           
         }else{
            System.out.println("El valos ingresado es CORRECTO ");
        }         
        }while(res!=num2);
    }
}

