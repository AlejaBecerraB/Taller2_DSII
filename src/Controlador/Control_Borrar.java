/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.validar_Informacion;
import java.util.ArrayList;

/**
 *
 * @author Alejandra Becerra
 */
public class Control_Borrar {
    validar_Informacion vi =new validar_Informacion();
    ArrayList datos = new ArrayList();
    
    public Control_Borrar() {
        
        
    }
    public ArrayList llenar_ced(){
        datos=vi.validar_cedula();
        return datos;
    }
    public ArrayList llenar_datos(int ced){
        datos=vi.datos(ced);
        return datos;
    }
    
}
