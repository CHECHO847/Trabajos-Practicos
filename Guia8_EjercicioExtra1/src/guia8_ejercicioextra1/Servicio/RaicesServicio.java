/*Vamos a realizar una clase llamada Raices, donde representaremos los
valores de una ecuación de 2º grado. Tendremos los 3 coeficientes
como atributos, llamémosles a, b y c. Hay que insertar estos 3 valores
para construir el objeto a través de un método constructor. Luego, en
RaicesServicio las operaciones que se podrán realizar son las siguientes:
a) Método getDiscriminante(): devuelve el valor del discriminante
(double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
b) Método tieneRaices(): devuelve un booleano indicando si tiene dos
soluciones, para que esto ocurra, el discriminante debe ser mayor o
igual que 0.
c) Método tieneRaiz(): devuelve un booleano indicando si tiene una
única solución, para que esto ocurra, el discriminante debe ser igual
que 0.
d) Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true,
imprime las 2 posibles soluciones.
e) Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime
una única raíz. Es en el caso en que se tenga una única solución
posible.
f) Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
y mostrará por pantalla las posibles soluciones que tiene nuestra
ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo
que devuelvan nuestros métodos y en caso de no existir solución, se
mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía
el signo delante de -b
 */
package guia8_ejercicioextra1.Servicio;

import guia8_ejercicioextra1.Entidad.Raices;

/**
 *
 * @author G5
 */
public class RaicesServicio {
    
    public double getDiscriminante(Raices dato){
      double discriminante= (Math.pow(dato.b, 2)-4*dato.a*dato.c);
      return discriminante;
    }

    public boolean tieneRaices(Raices dato){
        return getDiscriminante(dato)>0;
    }

    public boolean tieneRaiz(Raices dato){
        return getDiscriminante(dato)==0;
    }

    public void obtenerRaices(Raices dato){
        if (tieneRaices(dato)){
            double sol1=-dato.b+Math.sqrt(getDiscriminante(dato))/(2*dato.a);
            System.out.println("Primera Solucion " + sol1);
            double sol2=-dato.b-Math.sqrt(getDiscriminante(dato))/(2*dato.a);
            System.out.println("Segunda Solucion " + sol2);
        }
    }
    
    public void obtenerRaiz(Raices dato){
        if (tieneRaiz(dato)){
            double sol3=-dato.b+Math.sqrt(getDiscriminante(dato))/(2*dato.a);
            System.out.println(sol3);
        }
    }

    public void calcular(Raices dato){
        if (tieneRaices(dato)){
            obtenerRaices(dato);
        }else if (tieneRaiz(dato)){
            obtenerRaiz(dato);
        }else {
            System.out.println("No tiene solucion");
        }
    }
}
