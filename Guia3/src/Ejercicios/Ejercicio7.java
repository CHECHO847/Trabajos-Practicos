/*
 * Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este 
tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().

 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author G5
 */
public class Ejercicio7 {
    public static void main(String[] args){
        int cont=0, cont1=0;
        String fed="&&&&&", cadena="";
        Scanner leer=new Scanner(System.in);
        do{
        System.out.println("Ingrese una cadena");
        cadena=leer.nextLine().toUpperCase();
        int largo= cadena.length();
        if(largo==5){
            if(cadena.substring(0,1).equals("X") && cadena.substring(4,5).equals("O")){
                cont=cont+1;
            }else{
                cont1=cont1+1;
            }
          }
        }while (!cadena.equals("&&&&&"));
        System.out.println("La cantdidad de lecturas correctas fueron: "+ cont);
        System.out.println("La cantdidad de lecturas incorrectas fueron: "+ cont1);
    }
}
