/*
 * Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break
 */
package Ejercicios_Extras;

import java.util.Scanner;

/**
 *
 * @author G5
 */
public class Ejercicio8 {
    public static void main(String[] args){
        int cont=0,cont1=0,cont2=0,num;
        Scanner leer=new Scanner(System.in);
        do{
        System.out.println("Ingrese un valor");
        num=leer.nextInt();
        if (num>0){
            if (num%5==0){
                cont=cont+1;
                break;  
            }
            if (num%2==0){
            cont1=cont1+1;
                
            }else{
                cont2=cont2+1;
            }
        }
        }while(num != 0);
        System.err.println("Cantidad de numeros leidos:" + (cont+cont1+cont2));
        System.out.println("Cantidad de numeros pares: "+ cont1);
        System.out.println("Cantidad de numero impares: "+ cont2);
        
        
        
        
    }
}
