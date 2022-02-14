package edu.poniperro.domain;

import java.util.ArrayList;

public class Conductor {
    
    private String nombre;
    private String modelo;
    private String matricula;
    private double valoracionMedia;
    private boolean ocupado = false;

    private ArrayList<Byte> valoraciones = new ArrayList<Byte>();

    public Conductor() {};

    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String getModelo() {
        return this.modelo;
    }

    public double getValoracion() {
        return this.valoracionMedia;
    }

    public int getNumeroValoraciones() {
        return this.valoraciones.size();
    }

    public void setValoracion(byte valoracion) {
        this.valoraciones.add(valoracion);
        this.calcularValoracionMedia();
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public double calcularValoracionMedia() {
        int sumaValoraciones = 0;
        for (byte valoracion : this.valoraciones) {
            sumaValoraciones += valoracion;
        }
            this.valoracionMedia = (double) sumaValoraciones / this.valoraciones.size();
            return this.valoracionMedia;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
    public boolean isOcupado() {
        return this.ocupado;
    }

    public String getNombre() {
        return this.nombre;
    }

}
