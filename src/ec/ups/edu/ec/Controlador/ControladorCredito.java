package ec.ups.edu.ec.Controlador;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import Prestamo.Amortizacion;
import ec.ups.edu.clases.Cliente;
import ec.ups.edu.clases.Socio;
import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author Hp
 */
public class ControladorCredito {
   private List<Amortizacion> listaamoro;
    public ControladorCredito() {
        this.listaamoro=new ArrayList<>();
    }
    public void prestamo(){
       
    }
  
    public String buscarpagos(String codigo){
        return codigo;
        
    }
    public Cliente buscarCredito(Cliente cliente){
        return cliente;   
    }
    
    public Socio buscarCreditoS(Socio socio){
        return socio;   
    }
   
    
}
