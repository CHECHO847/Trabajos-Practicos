/*Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
arreglo B de 20 números reales. Crear la clase ArregloService, en el
paquete servicio, con los siguientes métodos:
1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
números aleatorios.
2) Método mostrar recibe un arreglo por parámetro y lo muestra por
pantalla.
3) Método ordenar recibe un arreglo por parámetro y lo ordena de
mayor a menor.
4) Método inicializarB copia los primeros 10 números del arreglo A en el
arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
mostrar A y B.
*/
package guia.pkg9_ejercicio3.Servicio;

import java.util.Arrays;

/**
 *
 * @author G5
 */
public class ArregloService {
    
    public double [] inicilizarA(double [] a){
        for (int i = 0; i < a.length; i++) {
            a[i]=(int) (Math.random()*5+1);
        }
        return a;
    }
    
    public void mostar(double [] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            System.out.print("-");
        }
        System.out.println("");
    }
    
    public void ordenar(double [] a){
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
    
    public void inicializarB(double [] b, double [] a){
        for (int i = 0; i < 10; i++) {
            b[i]=a[i];
        }
        for (int i = 10; i < 20; i++) {
            b[i]=0.5;
        }
    }
    
}
//Double[]auxiliar = new double[50];
//        Arrays.sort(A);
//        System.out.println("");
//        System.out.println("Vector A ordenado de menor a mayor");
//        for (int i = 0; i < 50; i++) {
//            auxiliar[i]=A[49-i];
//            System.out.print("["+A[i]+"]");
//        }
//        System.out.println("");
//        System.out.println("------------");
//        System.out.println("vector A ordenado de mayor a menor");
//        for (int i = 0; i < 50; i++) {
//            A[i]=auxiliar[i];
//            System.out.print("["+A[i]+"]");
//        }