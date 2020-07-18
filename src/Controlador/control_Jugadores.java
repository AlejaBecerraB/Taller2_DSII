/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.BaseDatos;
import Modelo.Insertar_informacion;
import Modelo.Jugador;
import Vista.Inicio;

/**
 *
 * @author Alejandra Becerra
 */
public class control_Jugadores {
    
    public control_Jugadores() {
        new BaseDatos();
        new Inicio();
        
    }
    
    public void crear(Jugador jug) throws Exception{
        String mensaje;
        if(jug == null){
            throw  new Exception("Los datos no estan agregados");
        }
        if(jug.getCedula() == 0){
            throw  new Exception("La cedula es obligatoria");
        }
        if("".equals(jug.getNombre())){
            throw  new Exception("El nombre es obligatorio");
        }
        if("".equals(jug.getApellido())){
            throw  new Exception("El apellido es obligatorio");
        }
        if("".equals(jug.getPosicion())){
            throw  new Exception("El posicion es obligatorio");
        }
    }
    
    
    public static void main(String[] args) {
        new control_Jugadores();

    }
    
}
