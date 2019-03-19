/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebasunitarias;

import java.util.HashMap;

/**
 *
 * @author johann alejandro torres soler 
 */
/**
 *clase persona donde declaramos las vraibales 
 *
 */
public class Persona {
    private int documento;
    private String nombre;
    private HashMap<Integer,Persona> datos;
/**
 *
 *constructor de las variables y mapa
 */
    public Persona(int documento, String nombre) {
        this.documento = documento;
        this.nombre = nombre;
        datos = new HashMap<>();
    }
/**
 *inicio get y set 
 *
 */
    public int getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public HashMap<Integer, Persona> getDatos() {
        return datos;
    }
    /**
 *
 *fin get y set 
 */
}
