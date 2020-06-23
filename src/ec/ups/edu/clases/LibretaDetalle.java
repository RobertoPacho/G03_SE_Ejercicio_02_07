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
public class LibretaDetalle {
    private Integer codigoDetalle;
    private Date fecha;
    private Transaccion transaccion;
    private Double monto;
    private Libreta numeroLibreta;
    private ArrayList<Movimiento> movimientoList;

    public LibretaDetalle() {
    }

    public Integer getCodigoDetalle() {
        return codigoDetalle;
    }

    public void setCodigoDetalle(Integer codigoDetalle) {
        this.codigoDetalle = codigoDetalle;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Transaccion getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(Transaccion transaccion) {
        this.transaccion = transaccion;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Libreta getNumeroLibreta() {
        return numeroLibreta;
    }

    public void setNumeroLibreta(Libreta numeroLibreta) {
        this.numeroLibreta = numeroLibreta;
    }

    public ArrayList<Movimiento> getMovimientoList() {
        return movimientoList;
    }

    public void setMovimientoList(ArrayList<Movimiento> movimientoList) {
        this.movimientoList = movimientoList;
    }
    

}
