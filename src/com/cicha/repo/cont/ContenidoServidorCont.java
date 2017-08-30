/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cicha.repo.cont;

import com.cicha.repo.ContenidoServidor;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Cicha
 */
public class ContenidoServidorCont {

    private static List<ContenidoServidor> all;

    static {
        all = new LinkedList<ContenidoServidor>();
        all.add(ContenidoServidor.build().setNombre("YouTube"));
        all.add(ContenidoServidor.build().setNombre("Vimeo"));
        all.add(ContenidoServidor.build().setNombre("Vimeo"));

    }

    public List<ContenidoServidor> findAll() {
        return all;
    }

    public ContenidoServidor find(String nombre) {
        ContenidoServidor contenidoServidor = all.stream()
                .filter(contServ -> contServ.getNombre().equals(nombre))
                .findFirst()
                .get();
        return contenidoServidor;
    }
}
