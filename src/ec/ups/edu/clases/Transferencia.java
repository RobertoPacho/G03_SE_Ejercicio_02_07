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
public class Transferencia {
    private Integer codigoTransferencia;
    private Cuenta numeroCuenta;
    private Cliente nombreBeneficiario;
    private String bancoDestino;
    private Double monto;
    private Cuenta cuenta;

    public Transferencia(Integer codigoTransferencia, Cuenta numeroCuenta, Cliente nombreBeneficiario, String bancoDestino, Double monto, Cuenta cuenta) {
        this.codigoTransferencia = codigoTransferencia;
        this.numeroCuenta = numeroCuenta;
        this.nombreBeneficiario = nombreBeneficiario;
        this.bancoDestino = bancoDestino;
        this.monto = monto;
        this.cuenta = cuenta;
    }

    public Integer getCodigoTransferencia() {
        return codigoTransferencia;
    }

    public void setCodigoTransferencia(Integer codigoTransferencia) {
        this.codigoTransferencia = codigoTransferencia;
    }

    public Cuenta getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Cuenta numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Cliente getNombreBeneficiario() {
        return nombreBeneficiario;
    }

    public void setNombreBeneficiario(Cliente nombreBeneficiario) {
        this.nombreBeneficiario = nombreBeneficiario;
    }

    public String getBancoDestino() {
        return bancoDestino;
    }

    public void setBancoDestino(String bancoDestino) {
        this.bancoDestino = bancoDestino;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
    
}
