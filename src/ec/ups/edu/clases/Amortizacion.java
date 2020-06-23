/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prestamo;
import java.util.Date;
/**
 *
 * @author Hp
 */
public class Amortizacion {
    private int idAmortizacion;
    private int cuotas;
    private double monto;
    private double capital;
    private double interes;
    private double saldo;
    private Date fehcaVencimiento;

    public Amortizacion() {
    }

    public int getIdAmortizacion() {
        return idAmortizacion;
    }

    public int getCuotas() {
        return cuotas;
    }

    public double getMonto() {
        return monto;
    }

    public double getCapital() {
        return capital;
    }

    public double getInteres() {
        return interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public Date getFehcaVencimiento() {
        return fehcaVencimiento;
    }

    public void setIdAmortizacion(int idAmortizacion) {
        this.idAmortizacion = idAmortizacion;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setFehcaVencimiento(Date fehcaVencimiento) {
        this.fehcaVencimiento = fehcaVencimiento;
    }
    
    
}
