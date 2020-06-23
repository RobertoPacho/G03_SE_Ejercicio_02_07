/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.clases;

/**
 *
 * @author David
 */
public class Cliente extends Persona {

    private Persona idCliente;

    public Cliente() {
    }

    public Persona getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Persona idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public void crearPersona() {

    }

    @Override
    public String buscarPersona(String cedula) {
        return cedula;
    }

    

    @Override
    public int calcularEdad() {
        return 0;
    }

    @Override
    public void actualizarPersona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarPersona(String cedula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
