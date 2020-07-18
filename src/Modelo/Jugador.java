/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Alejandra Becerra
 */
public class Jugador {
    int cedula;
    String nombre, apellido, posicion;

    public Jugador(int cedula, String nombre, String apellido, String posicion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    
}
