/*
 * Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs
con su correspondiente letra (NIF). Los atributos serán el número de DNI
(entero largo) y la letra (String o char) que le corresponde. En NIFService
se dispondrá de los siguientes métodos:
a) Métodos getters y setters para el número de DNI y la letra.
b) Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la
letra que le corresponderá. Una vez calculado, le asigna la letra que
le corresponde según
c) Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un
guion y la letra en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un
método que funciona de la siguiente manera: Para calcular la letra se
toma el resto de dividir el número de DNI por 23 (el resultado debe ser
un número entre 0 y 22). El método debe buscar en un array (vector) de
caracteres la posición que corresponda al resto de la división para
obtener la letra correspondiente. La tabla de caracteres es la siguiente:
 */
package guia8_ejercicioextra2.Servicio;

import guia8_ejercicioextra2.Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author G5
 */
public class NIFService {
    Scanner leer=new Scanner(System.in);
    String [] vector={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
    
            
    public void crearNif(NIF dato){
        System.out.println("Ingrese su D.N.I.");
        dato.setDni(leer.nextLong());
        int resto= (int) (dato.getDni()%23);
        System.out.println(vector[resto]);
        dato.setLetra(vector[resto]);
    }
    
   
    public void mostar(NIF dato){
        System.out.println("Su NIF es :"+dato.getDni()+"-"+dato.getLetra());
    }

}    
