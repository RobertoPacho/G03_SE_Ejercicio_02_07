package ec.ups.edu.clases;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author johan
 */
public class Cuenta {
private String idCuenta;
private Cliente idCliente;
private String tipoCuenta;
private Date fecha;
private Double ingreso;
private String descripcionIngreso;
private Double egresos;
private String descripcionEgreso;
private Double monto;
private ArrayList<Libreta> listaLibreta;  

    public Cuenta() {
    }

    public String getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getIngreso() {
        return ingreso;
    }

    public void setIngreso(Double ingreso) {
        this.ingreso = ingreso;
    }

    public String getDescripcionIngreso() {
        return descripcionIngreso;
    }

    public void setDescripcionIngreso(String descripcionIngreso) {
        this.descripcionIngreso = descripcionIngreso;
    }

    public Double getEgresos() {
        return egresos;
    }

    public void setEgresos(Double egresos) {
        this.egresos = egresos;
    }

    public String getDescripcionEgreso() {
        return descripcionEgreso;
    }

    public void setDescripcionEgreso(String descripcionEgreso) {
        this.descripcionEgreso = descripcionEgreso;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public ArrayList<Libreta> getListaLibreta() {
        return listaLibreta;
    }

    public void setListaLibreta(ArrayList<Libreta> listaLibreta) {
        this.listaLibreta = listaLibreta;
    }



}
