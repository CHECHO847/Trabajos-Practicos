/*Programa Nespresso. Desarrolle una clase Cafetera en el paquete
Entidades con los atributos capacidadMáxima (la cantidad máxima de
café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Agregar constructor vacío y con
parámetros así como setters y getters. Crear clase CafeteraServicio en
el paquete Servicios con los siguiente:
a) Método llenarCafetera(): hace que la cantidad actual sea igual a la
capacidad máxima.
b) Método servirTaza(int): se pide el tamaño de una taza vacía, el
método recibe el tamaño de la taza y simula la acción de servir la
taza con la capacidad indicada. Si la cantidad actual de café “no
alcanza” para llenar la taza, se sirve lo que quede. El método le
informará al usuario si se llenó o no la taza, y de no haberse llenado
en cuanto quedó la taza.
c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
d) Método agregarCafe(int): se le pide al usuario una cantidad de café,
el método lo recibe y se añade a la cafetera la cantidad de café
indicada.
 * 
 */
package guia.pkg8_ejercicio2.Servicio;

import guia.pkg8_ejercicio2.Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author G5
 */
public class CafeteraServicio {
    Scanner leer=new Scanner (System.in);
    
    public Cafetera nueva(){
        System.out.println("Ingrese la cantidad maxima de cafe de la Cafetera");
        int maxima=leer.nextInt();
        System.out.println("Ingrese la cantidad actual de cafe en la cafetera");
        int actual=leer.nextInt();
        return new Cafetera(maxima, actual);
    }
        
    public void llenarCafetera(Cafetera cafe){
        cafe.setCantidadActual(cafe.getCapacidadMaxima());
    }
    
    public void servirTaza(Cafetera cafe){
        System.out.println("Ingrese el tamaño de una taza vacia");
        int taza=leer.nextInt();
        if (taza<cafe.getCantidadActual()){
            System.out.println("Su taza se lleno");
            cafe.setCantidadActual(cafe.getCantidadActual()-taza);
        }else{
            int porcentaje=cafe.getCantidadActual()*100/taza;
            System.out.println("Su taza se lleno al: "+porcentaje+ "%");
            cafe.setCantidadActual(0);
        }
    }    
        
    public void vaciarCafetera(Cafetera cafe){
        cafe.setCantidadActual(0);
    }
    
    public void agregarCafe(Cafetera cafe){
        System.out.println("Ingrese la cantidad de Cafe para agregar");
        int ingreso=leer.nextInt();
        ingreso=ingreso+cafe.getCantidadActual();
        if (ingreso>cafe.getCapacidadMaxima()){
            System.out.println("La cantidad ingresada supera el limite permitido");
        }else{
            System.out.println("La cafetera ha sido llenada");
        }
         
    }
    
    
}
