/*En el paquete Servicios crear PersonaServicio con los siguientes 3
métodos:
a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La
función devuelve un booleano.
b) Metodo crearPersona(): el método crear persona, le pide los valores
de los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Persona. Además, comprueba que el
sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
deberá mostrar un mensaje.
c) Método calcularIMC(): calculara si la persona está en su peso ideal
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
valor menor que 20, significa que la persona está por debajo de su
peso ideal y la función devuelve un -1. Si la fórmula da por resultado
un número entre 20 y 25 (incluidos), significa que la persona está en
su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la función devuelve un 1.

 */
package guia.pkg8_ejercicio3.Servicio;

import guia.pkg8_ejercicio3.Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author G5
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        String sexo;
        System.out.println("Ingrese nombre");
        String nombre = leer.next();
        System.out.println("Ingrese edad");
        int edad = leer.nextInt();
        do {
            System.out.println("Ingrese su Sexo: " + " H (Hombre) M (Mujer) O (Otro) ");
            sexo = leer.next().toUpperCase();
        } while (!"H".equals(sexo) && !"M".equals(sexo) && !"O".equals(sexo));
        System.out.println("Ingrese su peso");
        double peso = leer.nextDouble();
        System.out.println("Ingrese su altura");
        double altura = leer.nextDouble();
        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public boolean MayordeEdad(Persona edad) {
        if (edad.getEdad() >= 18) {
            System.out.println("Es Mayor");
        } else {
            System.out.println("Es menor");
        }
        return (edad.getEdad() >= 18);
    }

    public int calcularIMC(Persona IMC) {
        double formula = (IMC.getPeso() / (IMC.getAltura() * IMC.getAltura()));
        if (formula < 20) {
            System.out.println("Esta Bajo peso");
            return -1;
        } else if (formula > 20 && formula <= 25) {
            System.out.println("Esta en su peso ideal");
            return 0;
        } else {
            System.out.println("ESta con sobrepeso");
            return 1;
        }
    }

    public void porcentajeEdad(boolean[] edad) {
        int cont = 0;
        for (int i = 0; i < edad.length; i++) {
            if (edad[i]) {
                cont++;
            }
        }
        System.out.println("El porcentaje de gente mayor es: " + (cont * 100) / edad.length + "%");
        System.out.println("El porcentaje de gente menor de edad es: " + (100 - ((cont * 100) / edad.length)) + "%");

    }

    public void porcentajeIMc(int[] IMC) {
        int sobre = 0, ideal = 0;
        for (int i = 0; i < IMC.length; i++) {
            if (IMC[i] == 1) {
                sobre++;
            } else if (IMC[i] == 0) {
                ideal++;
            }
        }
        System.out.println("Las personas con sobrepeso son un : " + (sobre * 100) / IMC.length + "%");
        System.out.println("Las personas con peso ideal son un : " + (ideal * 100) / IMC.length + "%");
        System.out.println("Las personas con peso bajo son un:" + (100 - ((sobre * 100) / IMC.length) + ((ideal * 100) / IMC.length)) + "%");

    }

}
