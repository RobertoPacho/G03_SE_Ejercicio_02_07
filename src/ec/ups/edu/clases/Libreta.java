package ec.ups.edu.clases;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Date;

/**
 *
 * @author johan
 */
public class Libreta {
    private Integer codigoLibreta;
    private Date    fechaApertura;
    private Cuenta cuenta;

    public Libreta(Integer codigoLibreta, Date fechaApertura, Cuenta cuenta) {
        this.codigoLibreta = codigoLibreta;
        this.fechaApertura = fechaApertura;
        this.cuenta = cuenta;
    }

    public Integer getCodigoLibreta() {
        return codigoLibreta;
    }

    public void setCodigoLibreta(Integer codigoLibreta) {
        this.codigoLibreta = codigoLibreta;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
    
}
