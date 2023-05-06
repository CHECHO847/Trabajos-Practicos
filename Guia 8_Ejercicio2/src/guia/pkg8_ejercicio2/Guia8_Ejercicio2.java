/*
 * 
 */
package guia.pkg8_ejercicio2;

import guia.pkg8_ejercicio2.Entidad.Cafetera;
import guia.pkg8_ejercicio2.Servicio.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author G5
 */
public class Guia8_Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
       CafeteraServicio nuevo=new CafeteraServicio();
       Cafetera cafe=nuevo.nueva();
        int opcion=0;
        do{
        System.out.println("Menu de Opciones");
        System.out.println("1 - Llenar Cafetera");
        System.out.println("2 - Servir Taza");
        System.out.println("3 - Vacia Cafetera");
        System.out.println("4 - Agregar Cafe");
        System.out.println("5 - Salir");
        System.out.println("Elija la opcion deseada");
        opcion=leer.nextInt();
        switch (opcion){
            case 1:
                nuevo.llenarCafetera(cafe);
                break;
            case 2:
                nuevo.servirTaza(cafe);
                break;
            case 3:
                nuevo.vaciarCafetera(cafe);
                break;
            case 4:
                nuevo.agregarCafe(cafe);
                break;
            case 5:
                System.out.println("Esta abandonando el sistema");
                opcion=1;
                break;
            default:
                System.out.println("La opcion ingresada es Incorecta");
        }
        
    }while (opcion!=1);
    
}
}
