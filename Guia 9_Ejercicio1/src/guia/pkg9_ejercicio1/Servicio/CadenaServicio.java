/*Realizar una clase llamada Cadena, en el paquete de entidades, que
tenga como atributos una frase (String) y su longitud. Agregar
constructor vacío y con atributo frase solamente. Agregar getters y
setters. El constructor con frase como atributo debe setear la longitud
de la frase de manera automática. Crear una clase CadenaServicio en el
paquete servicios que implemente los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales
que tiene la frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado
por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
veces.
e) Método compararLongitud(String frase), deberá comparar la longitud
de la frase que compone la clase con otra nueva frase ingresada por
el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la
clase Cadena con una nueva frase ingresada por el usuario y mostrar
la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras
“a” que se encuentren en la frase, por algún otro carácter
seleccionado por el usuario y mostrar la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene
una letra que ingresa el usuario y devuelve verdadero si la contiene y
falso si no.
*/
package guia.pkg9_ejercicio1.Servicio;

import guia.pkg9_ejercicio1.Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author G5
 */
public class CadenaServicio {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    
    public Cadena frase(){
        System.out.println("Ingrese una frase");
        String cadena1=leer.next().toLowerCase();
        return new Cadena(cadena1);
    }

    public void mostrarVocales(Cadena dato){
        int cont=0;
        for (int i = 0; i < dato.getLongitud(); i++) {
            if ("a".equals(dato.getFrase().substring(i,i+1))||"e".equals(dato.getFrase().substring(i,i+1))||"i".equals(dato.getFrase().substring(i,i+1))||"o".equals(dato.getFrase().substring(i,i+1))||"u".equals(dato.getFrase().substring(i,i+1))){
            cont++;    
            }
        }
       System.out.println("La cantidad de vocales son :" +cont);   
    }
   
    public void invertirFrase(Cadena dato){
        for (int i = dato.getLongitud(); i > 0; i--) {
            System.out.print(dato.getFrase().substring(i-1, i));
        }
        System.out.println("");
    }

    public void vecesRepetido (Cadena dato){
       int cont=0;
       System.out.println("Ingrese la letra a buscar");
        String letra=leer.next();
       for (int i = 0; i < dato.getLongitud(); i++) {
            if (letra.equals(dato.getFrase().substring(i,i+1))) {
            cont++;
            }
        }
        System.out.println(cont);
    }
    
    public void compararLongitud(Cadena dato){
        System.out.println("Ingrese nueva frase");
        dato.setFrase1(leer.next());
        if(dato.getLongitud()==dato.getFrase1().length()){
            System.out.println("Las frases tienen la misma longitud");
        }else{
            System.out.println("Las frases no tienen la misma longitud");
        }
    }
    
    public void unirFrases(Cadena dato){
        System.out.println(dato.getFrase().concat(dato.getFrase1()));
    }
    
    public void reemplazar(Cadena dato){
        System.out.println("Ingrese el caracter que desea colocar");
        String caracter=leer.next();
        String cambio=dato.getFrase().replace("a",caracter);
       System.out.println(cambio);   
    }
    
    public boolean  contiene (Cadena dato){
        System.out.println("Ingrese la letra a buscar");
        String letra=leer.next();
       return dato.getFrase().contains(letra);
    }   
}     
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    

