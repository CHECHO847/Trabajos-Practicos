/*
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author G5
 */
public class Ejercicio8 {
    public static void main(String[] args){
        int i,j,num;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese los elementos del cuadrado");
        num=leer.nextInt();
        for(i=0; i< num; i++) {
           System.out.print("*"); 
        }    
         System.out.println("");
         for(i=2; i < num; i++) {
           System.out.print("*"); 
           for (j=2; j<num; j++){
              System.out.print(" "); 
            }
         System.out.println("*"); 
        }    
        for(i=0; i< num; i++) {
           System.out.print("*"); 
        }    
        System.out.println("");
           }      
}
 //OTRA FORMA///
//public class Prueba {
//    public static void main(String[] args) {
//        Scanner leer = new Scanner(System.in);
//        System.out.println("Ingrese el valor del cuadrado");
//        int num = leer.nextInt();
//        
//        for(int i = 0; i < num; i++){
//            for(int j = 0; j < num; j++){
//                if(i == 0 || i == num-1 || j == 0 || j == num-1){
//                    System.out.print("* ");
//               }else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}
       
      