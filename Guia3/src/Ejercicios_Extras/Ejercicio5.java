/*
 * Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.

 */
package Ejercicios_Extras;

import java.util.Scanner;

/**
 *
 * @author G5
 */
public class Ejercicio5 {
    public static void main(String[] args){
        int num,num1;
        Scanner leer=new Scanner(System.in);
          
        System.out.println("*******************");
        System.out.println("* Tipo de Plan    *");
        System.out.println("*      A          *");
        System.out.println("*      B          *");
        System.out.println("*      C          *");
        System.out.println("*******************");
        System.out.println(" Elija una opcion: ");
       String opcion=leer.nextLine();
       switch (opcion.toUpperCase()){
           case "A":
               System.out.println("Ingrese el costo del Tratamiento");
               num=leer.nextInt();   
               num1=(num*50)/100;
               System.out.println("El monto a abonar es de $  " + (num1));
               break;
           case "B":
               System.out.println("Ingrese el costo del Tratamiento");
               num=leer.nextInt();   
               num1=(num*35)/100;
               System.out.println("El monto a abonar es de $  " + (num1));
               break;
           case "C":
               System.out.println("Este plan no tiene descuento en los tratamientos");
               break;
             default:
               System.out.println("La opcion ingresada no es correcta");
        
       }
    }
}
