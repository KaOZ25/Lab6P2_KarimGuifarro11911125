/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_karimguifarro11911125;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author karim
 */
public class Partida implements Serializable{
    String nombre;
    Date Fecha;
    ArrayList<Estrella> estrellas;
    ArrayList<Jugador> jugadores;

    public Partida() {
    }
    
    public Partida(String nombre, Date Fecha, ArrayList<Estrella> estrellas, ArrayList<Jugador> jugadores) {
        this.nombre = nombre;
        this.Fecha = Fecha;
        this.estrellas = estrellas;
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public ArrayList<Estrella> getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(ArrayList<Estrella> estrellas) {
        this.estrellas = estrellas;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Partida{" + "nombre=" + nombre + ", Fecha=" + Fecha + ", estrellas=" + estrellas + ", jugadores=" + jugadores + '}';
    }
    
}
