package ec.ups.edu.clases;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author johan
 */
public class Transaccion {
 
        private Double transaccion;
    private String tipoTransaccion;
    private Libreta numeroLibreta;
    private Double monto;

    public Transaccion(Double transaccion, String tipoTransaccion, Libreta numeroLibreta, Double monto) {
        this.transaccion = transaccion;
        this.tipoTransaccion = tipoTransaccion;
        this.numeroLibreta = numeroLibreta;
        this.monto = monto;
    }

    public Double getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(Double transaccion) {
        this.transaccion = transaccion;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public Libreta getNumeroLibreta() {
        return numeroLibreta;
    }

    public void setNumeroLibreta(Libreta numeroLibreta) {
        this.numeroLibreta = numeroLibreta;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }
}
