/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_karimguifarro11911125;

import java.io.Serializable;

/**
 *
 * @author karim
 */
public class Jugador implements Serializable{
    String nombre;
    int velocidad;

    public Jugador() {
    }

    public Jugador(String nombre, int velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", velocidad=" + velocidad + '}';
    }
    
}
