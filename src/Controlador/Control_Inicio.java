/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.BaseDatos;
import Vista.Inicio;


public class Control_Inicio {

    public Control_Inicio() {
        new BaseDatos();
        new Inicio();
    }
    
    public static void main(String[] args) {
        new Control_Inicio();
    }
}
