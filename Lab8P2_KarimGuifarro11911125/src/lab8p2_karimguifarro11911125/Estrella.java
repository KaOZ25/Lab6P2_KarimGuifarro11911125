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
public class Estrella implements Serializable{
    String nombre;
    int distancia;
    String descripcion;

    public Estrella() {
    }

    public Estrella(String nombre, int distancia, String descripcion) {
        this.nombre = nombre;
        this.distancia = distancia;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
