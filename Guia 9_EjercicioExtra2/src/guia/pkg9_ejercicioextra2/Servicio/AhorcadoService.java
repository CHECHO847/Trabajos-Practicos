/*Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual
deberá contener como atributos, un vector con la palabra a buscar, la
cantidad de letras encontradas y la cantidad jugadas máximas que
puede realizar el usuario. Definir los siguientes métodos en
AhorcadoService:
● Metodo crearJuego(): le pide la palabra al usuario y cantidad de
jugadas máxima. Con la palabra del usuario, pone la longitud de la
palabra, como la longitud del vector. Después ingresa la palabra en el
vector, letra por letra, quedando cada letra de la palabra en un índice
del vector. Y también, guarda la cantidad de jugadas máximas y el
valor que ingresó el usuario.
● Método longitud(): muestra la longitud de la palabra que se debe
encontrar. Nota: buscar como se usa el vector.length.
● Método buscar(letra): este método recibe una letra dada por el
usuario y busca si la letra ingresada es parte de la palabra o no.
También informará si la letra estaba o no.
● Método encontradas(letra): que reciba una letra ingresada por el
usuario y muestre cuantas letras han sido encontradas y cuántas le
faltan. Este método además deberá devolver true si la letra estaba y
false si la letra no estaba, ya que, cada vez que se busque una letra
que no esté, se le restará uno a sus oportunidades.
● Método intentos(): para mostrar cuántas oportunidades le queda al
jugador.
● Método juego(): el método juego se encargará de llamar todos los
métodos previamente mencionados e informará cuando el usuario
descubra toda la palabra o se quede sin intentos. Este método se
llamará en el main.
 */
package guia.pkg9_ejercicioextra2.Servicio;

import guia.pkg9_ejercicioextra2.Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author G5
 */
public class AhorcadoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {
        System.out.println("Ingrese la palabra");
        String palabra = leer.next();
        String[] vector = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            vector[i] = palabra.substring(i, i + 1);
        }
        System.out.println("Cantidad de Jugadas Maximas");
        int jugadas = leer.nextInt();
        return new Ahorcado(vector, jugadas);
    }

    public void longitud(Ahorcado a) {
        System.out.println("El largo de la palabra a buscar es: " + a.getVector().length);
    }

    public void buscarLetra(Ahorcado a, String letra1) {
        int cont = 0;
        for (int i = 0; i < a.getVector().length; i++) {
            if (a.getVector()[i].equals(letra1)) {
                cont++;
            }
        }
        if (cont > 0) {
            System.out.println("La letra ingresada es parte de la palabra");
        } else {
            System.out.println("La letra ingresasada no es parte de la palabra");
        }
    }

    public boolean encontradas(Ahorcado a, String letra1) {
        int cont = 0;
        for (int i = 0; i < a.getVector().length; i++) {
            if (a.getVector()[i].equals(letra1)) {
                cont++;
                
            }
        }
        a.setLetraEncontradas(a.getLetraEncontradas()+cont);
        System.out.println("Letras encontradas: " + cont);
        System.out.println("Letras faltantes: " + (a.getVector().length - a.getLetraEncontradas()));
        return cont > 0;
    }

    public void intentos(Ahorcado a) {
        if (a.getJugadas() > 0) {
            System.out.println("Numero de Oportunidades Restantes: " + Math.abs(a.getJugadas()));
        } else {
            System.out.println("Lo sentimos, no hay mas oportunidades");
        }
    }

    public void juego() {
        Ahorcado a = crearJuego();
        longitud(a);
        do {
            System.out.println("Ingrese la letra a buscar");
            String letra = leer.next();
            buscarLetra(a, letra);
            if (encontradas(a, letra)) {
                System.out.println("Acertaste la letra esta en la palabra");
            } else {
                System.out.println("La letra no pertenece a la palabra");
                a.setJugadas(a.getJugadas() - 1);
            }
            intentos(a);
            if (a.getVector().length - a.getLetraEncontradas() == 0) {
                System.out.println("Adivinaste la palabra");
            }
        } while (a.getJugadas() != 0 && a.getVector().length - a.getLetraEncontradas() > 0);

    }
}
