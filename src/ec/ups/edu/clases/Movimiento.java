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
public class Movimiento {
    
    private String numeroCUenta;
    private String descripcionCuenta;
    private String clasificacionCuenta;
    private String tipoCuenta;
    private Cliente idCliente;
    private Transferencia transferencia;
    private Double costo;
    private Double balance;

    public Movimiento(String numeroCUenta, String descripcionCuenta, String clasificacionCuenta, String tipoCuenta, Cliente idCliente, Transferencia transferencia, Double costo, Double balance) {
        this.numeroCUenta = numeroCUenta;
        this.descripcionCuenta = descripcionCuenta;
        this.clasificacionCuenta = clasificacionCuenta;
        this.tipoCuenta = tipoCuenta;
        this.idCliente = idCliente;
        this.transferencia = transferencia;
        this.costo = costo;
        this.balance = balance;
    }

    public String getNumeroCUenta() {
        return numeroCUenta;
    }

    public void setNumeroCUenta(String numeroCUenta) {
        this.numeroCUenta = numeroCUenta;
    }

    public String getDescripcionCuenta() {
        return descripcionCuenta;
    }

    public void setDescripcionCuenta(String descripcionCuenta) {
        this.descripcionCuenta = descripcionCuenta;
    }

    public String getClasificacionCuenta() {
        return clasificacionCuenta;
    }

    public void setClasificacionCuenta(String clasificacionCuenta) {
        this.clasificacionCuenta = clasificacionCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Transferencia getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(Transferencia transferencia) {
        this.transferencia = transferencia;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    
    
}
