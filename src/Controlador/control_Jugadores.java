/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.BaseDatos;
import Modelo.Jugador;
import Vista.Inicio;

/**
 *
 * @author Alejandra Becerra
 */
public class control_Jugadores {
    
    
    public control_Jugadores() {
        
    }
    
    public void crear(Jugador jug) throws Exception{
        if(jug == null){
            throw  new Exception("Los datos no estan agregados");
        }
    }
    
    
    public static void main(String[] args) {
        new Inicio();
//        new BaseDatos();
    }
    
}
