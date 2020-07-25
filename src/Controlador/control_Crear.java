/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.BaseDatos;
import Modelo.Guardar_Informacion;
import Modelo.Jugador;
import Modelo.validar_Informacion;
import Vista.Inicio;
import java.util.ArrayList;

/**
 *
 * @author Alejandra Becerra
 */
public class control_Crear {
    ArrayList cedula = new ArrayList();
        
    public void crear(Jugador jug) throws Exception{
        
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
        
        validar_Informacion vi = new validar_Informacion();
        cedula=vi.validar_cedula();
        
        for (int i = 0; i < cedula.size(); i++) {
            if(jug.getCedula()== Integer.parseInt((String) cedula.get(i)) ){
                System.out.println("existe");
                throw  new Exception("La cedula escrita ya existe en la base de datos.");
            } 
        }
        new Guardar_Informacion(jug);
    }
    
    
}
