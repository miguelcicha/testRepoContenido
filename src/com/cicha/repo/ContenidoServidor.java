/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cicha.repo;

/**
 *
 * @author Cicha
 */
public class ContenidoServidor {

    private String nombre;

    public ContenidoServidor() {
    }

    public static ContenidoServidor build() {
        return new ContenidoServidor();
    }

    public ContenidoServidor setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

}
