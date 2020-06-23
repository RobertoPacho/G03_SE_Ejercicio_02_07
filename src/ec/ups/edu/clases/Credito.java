package ec.ups.edu.clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author Hp
 */
public class Credito {
    private int codigo;
    private double cantidad;
    private double meses;
    private double intereses;
    private Persona idPersona;
    private ArrayList listaAmortizacion;

    public ArrayList getListaAmortizacion() {
        return listaAmortizacion;
    }

    public void setListaAmortizacion(ArrayList listaAmortizacion) {
        this.listaAmortizacion = listaAmortizacion;
    }

    public Credito() {
    }

    public int getCodigo() {
        return codigo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public double getMeses() {
        return meses;
    }

    public double getIntereses() {
        return intereses;
    }

    public Persona getIdPersona() {
        return idPersona;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void setMeses(double meses) {
        this.meses = meses;
    }

    public void setIntereses(double intereses) {
        this.intereses = intereses;
    }

    public void setIdPersona(Persona idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public String toString() {
        return "Credito{"+"codigo"+codigo+"meses"+meses+"intereses"+intereses+"idPersona"+idPersona+"listaamortizacion"+listaAmortizacion+"}";
    }
    
}