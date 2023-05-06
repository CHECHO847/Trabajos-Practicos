/*
 * Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author G5
 */
public class Ejercicio6 {
    public static void main(String[] args){
        int num,num1,adios,opcion=0;
        //String fuera=null;
        Scanner leer=new Scanner(System.in);
     do{  
        System.out.println("**********************");
        System.out.println("*     Menu           *");
        System.out.println("* 1 - Suma           *");
        System.out.println("* 2 - Resta          *");
        System.out.println("* 3 - Multiplicacion *");
        System.out.println("* 4 - Division       *");
        System.out.println("* 5 - Salir          *");
        System.out.println("**********************");
        System.out.println("    Elija una opcion: ");
       opcion=leer.nextInt();
       switch (opcion){
           case 1:
               System.out.println("Ingrese el primer valor");
               num=leer.nextInt();   
               System.out.println("Ingrese el segundo");
               num1=leer.nextInt();
               System.out.println("Elresultado de la operacion es: " + (num+num1));
               break;
           case 2:
               System.out.println("Ingrese el primer valor");
               num=leer.nextInt();   
               System.out.println("Ingrese el segundo");
               num1=leer.nextInt();
               System.out.println("Elresultado de la operacion es: " + (num-num1));
               break;
           case 3:
               System.out.println("Ingrese el primer valor");
               num=leer.nextInt();   
               System.out.println("Ingrese el segundo");
               num1=leer.nextInt();
               System.out.println("Elresultado de la operacion es: " + (num*num1));
               break;
           case 4:
               System.out.println("Ingrese el primer valor");
               float num2=leer.nextFloat();   
               System.out.println("Ingrese el segundo");
               float num3=leer.nextFloat();
               System.out.println("Elresultado de la operacion es: " + (num2/num3));
               break;
            case 5:
               System.out.print("¿Esta seguro que desea salir del Programa S/N? ");
               String fuera=leer.next();
               if (fuera.equals("N")){
               opcion=0;    
               }                
               break;
            default:
               System.out.println("La opcion ingresada no es correcta elija nuevamente");
        
       }
       }while(opcion!=5);
       }
}    
        
    
        
        
         

