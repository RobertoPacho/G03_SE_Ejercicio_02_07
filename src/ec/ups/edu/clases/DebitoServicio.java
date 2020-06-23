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
public class DebitoServicio {
    private Integer codigDebito;
    private Cliente idCliente;
    private Date fechaPago;
    private Double monto;
    private Libreta numeroLibreta;

    public DebitoServicio(Integer codigDebito, Cliente idCliente, Date fechaPago, Double monto, Libreta numeroLibreta) {
        this.codigDebito = codigDebito;
        this.idCliente = idCliente;
        this.fechaPago = fechaPago;
        this.monto = monto;
        this.numeroLibreta = numeroLibreta;
    }
    
    
}
