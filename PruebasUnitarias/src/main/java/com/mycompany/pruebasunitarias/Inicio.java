/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebasunitarias;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author johann alejandro torres soler
 */
public class Inicio {
/**
 *
 * inicialisamos el mapa 
 */
    public HashMap<Integer, Persona> mapaAbuelo;

    public void Menu() {
/**
 *
 *inciamos el programa  y las funciones que vamso a utilizar 
 */
        mapaQuemado();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite identificacion:");
        int identificacion = sc.nextInt();
        buscar(identificacion);
    }
/**
 *
 *metodo que contiene el mapa quemado que evaluaremos en el test 
 */
    private void mapaQuemado() {
        /**
 *
 *creacion y asignacion de las personas al mapa 
 */
        mapaAbuelo = new HashMap<>();
        mapaAbuelo.put(1, new Persona(1, "Juan"));
        mapaAbuelo.put(2, new Persona(2, "Jose"));
        mapaAbuelo.get(1).getDatos().put(3, new Persona(3, "Andres"));
        mapaAbuelo.get(1).getDatos().put(4, new Persona(4, "Maria"));
        mapaAbuelo.get(1).getDatos().put(5, new Persona(5, "Carlos"));
        mapaAbuelo.get(2).getDatos().put(6, new Persona(6, "Alberto"));
        mapaAbuelo.get(2).getDatos().put(7, new Persona(7, "Jimmy"));
        mapaAbuelo.get(2).getDatos().put(8, new Persona(8, "Jhon"));
        mapaAbuelo.get(1).getDatos().get(3).getDatos().put(9, new Persona(9, "Juana"));
        mapaAbuelo.get(1).getDatos().get(3).getDatos().put(10, new Persona(10, "Paola"));
        mapaAbuelo.get(1).getDatos().get(4).getDatos().put(11, new Persona(11, "Sofia"));
        mapaAbuelo.get(1).getDatos().get(5).getDatos().put(12, new Persona(12, "Jaime"));
        mapaAbuelo.get(2).getDatos().get(6).getDatos().put(13, new Persona(13, "Tatiana"));
        mapaAbuelo.get(2).getDatos().get(6).getDatos().put(14, new Persona(14, "Fernanda"));
        mapaAbuelo.get(2).getDatos().get(7).getDatos().put(15, new Persona(15, "Viviana"));
        mapaAbuelo.get(2).getDatos().get(8).getDatos().put(16, new Persona(16, "Diana"));
        
    }
/**
 *
 *mwtodo para buscar el dato introducido por el usuario en el mapa 
 */
    public String buscar(int identificacion) {
        /**
 *
 *llamado a buscar en el mapa 
 */
        mapaQuemado();
        String total = "";
        ArrayList<String> string2= new ArrayList<String>();
        ArrayList<String> string3= new ArrayList<String>();
        ArrayList<String> string6= new ArrayList<String>();
        String p1 = "";
        String p2 = "";
        String p3 = "";
        String p4 = "";
        String p5 = "";
        String p6 = "";
        /**
 *
 *evaluamos el dato introducido por el uduario en los diferentes casos posibles 
 */
        if (mapaAbuelo.containsKey(identificacion)) {
            System.out.println("Abuelo: " + mapaAbuelo.get(identificacion).getNombre() + "\nPadres :");
            p1 = mapaAbuelo.get(identificacion).getNombre();    
            Iterator it = mapaAbuelo.get(identificacion).getDatos().keySet().iterator();
            while (it.hasNext()) {
                int i = Integer.parseInt(it.next().toString());
                System.out.println(mapaAbuelo.get(identificacion).getDatos().get(i).getNombre());
                string2.add(mapaAbuelo.get(identificacion).getDatos().get(i).getNombre());
                System.out.println("Nietos: ");
                Iterator itera = mapaAbuelo.get(identificacion).getDatos().get(i).getDatos().keySet().iterator();
                while (itera.hasNext()) {
                    int j = Integer.parseInt(itera.next().toString());
                    System.out.println(mapaAbuelo.get(identificacion).getDatos().get(i).getDatos().get(j).getNombre());
                    string3.add(mapaAbuelo.get(identificacion).getDatos().get(i).getDatos().get(j).getNombre());
                }
            }
            for(int a=0;a<string2.size();a++){
                p2= p2+" "+string2.get(a);
            }
            for(int b=0;b<string3.size();b++){
                p3= p3+" "+string3.get(b);
            }
            total = p1+p2+p3;
        } 
        else {
            Iterator it = mapaAbuelo.keySet().iterator();
            while (it.hasNext()) {
                int i = Integer.parseInt(it.next().toString());
                if (mapaAbuelo.get(i).getDatos().containsKey(identificacion)) {
                    System.out.println("Padre: " + mapaAbuelo.get(i).getDatos().get(identificacion).getNombre() + " Abuelo : "
                            + mapaAbuelo.get(i).getNombre() + " Hijos: ");
                    p4 = mapaAbuelo.get(i).getDatos().get(identificacion).getNombre();
                    p5 = mapaAbuelo.get(i).getNombre();
                    Iterator itera = mapaAbuelo.get(i).getDatos().get(identificacion).getDatos().keySet().iterator();

                    while (itera.hasNext()) {
                        int j = Integer.parseInt(itera.next().toString());
                        System.out.println(mapaAbuelo.get(i).getDatos().get(identificacion).getDatos().get(j).getNombre());
                        string6.add(mapaAbuelo.get(i).getDatos().get(identificacion).getDatos().get(j).getNombre());
                    }
                    for(int a=0;a<string6.size();a++){
                        p6= p6+" "+string6.get(a);
                    }
                    
                    total = p4+" "+p5+p6;
                } 
                else {
                    Iterator itera = mapaAbuelo.get(i).getDatos().keySet().iterator();
                    while (itera.hasNext()) {
                        int j = Integer.parseInt(itera.next().toString());
                        if (mapaAbuelo.get(i).getDatos().get(j).getDatos().containsKey(identificacion)) {
                            System.out.println("Hijo " + mapaAbuelo.get(i).getDatos().get(j).getDatos().get(identificacion).getNombre() 
                                    + " Padre" + mapaAbuelo.get(i).getDatos().get(j).getNombre() + "\n Abuelo: " + mapaAbuelo.get(i).getNombre());
                            total = mapaAbuelo.get(i).getDatos().get(j).getDatos().get(identificacion).getNombre() + " " + mapaAbuelo.get(i).getDatos().get(j).getNombre() + " " + mapaAbuelo.get(i).getNombre();
                            
                        }
                    }
                }
            }
        }
        /**
 *impresion por consola de los rsultados 
 *
 */
        System.out.println(total);
        return total;
    }

}
