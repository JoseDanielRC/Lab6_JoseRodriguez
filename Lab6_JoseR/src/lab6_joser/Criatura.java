/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_joser;

import java.util.ArrayList;

class Criatura {
    private String nombre;
    private double energia;
    private int anosmax;
    private String region;
    private int vivas;
    private ArrayList<String>objetos=new ArrayList();

    public Criatura(String nombre, double energia, int añosmax, String region, int vivas) {
        this.nombre = nombre;
        this.energia = energia;
        this.anosmax = añosmax;
        this.region = region;
        this.vivas = vivas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    public int getAnosmax() {
        return anosmax;
    }

    public void setAnosmax(int añosmax) {
        this.anosmax = añosmax;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getVivas() {
        return vivas;
    }

    public void setVivas(int vivas) {
        this.vivas = vivas;
    }

    public ArrayList<String> getObjetos() {
        return objetos;
    }

    public void setObjetos(String objeto) {
        objetos.add(objeto);
    }
    
}
