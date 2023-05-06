/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_ejercicioextra2;



import guia8_ejercicioextra2.Entidad.NIF;
import guia8_ejercicioextra2.Servicio.NIFService;


/**
 *
 * @author G5
 */
public class Guia8_EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NIFService nuevo=new NIFService();
        NIF numero=new NIF();
        nuevo.crearNif(numero);
        nuevo.mostar(numero);
        
        
        
    }
    
}
