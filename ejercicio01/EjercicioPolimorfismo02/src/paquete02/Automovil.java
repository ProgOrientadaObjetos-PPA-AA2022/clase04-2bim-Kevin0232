/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public abstract class  Automovil {
    protected String nombreP;
    protected String placa;
    protected double valorCancelar;
    
    public void establecerNombrePropietario(String c){
        nombreP = c;
    }
    public void establecerPlaca(String c){
        placa = c;
    }
    
    public abstract void calcularValorCancelar();
    
    public String obtenerNombre(){
        return nombreP;
    }
    public String obtenerPlaca(){
        return placa;
    }
    public double obtenerValorCancelar(){
        return valorCancelar;
    }
    @Override
    public String toString(){
        String cadena = String.format("Nombre Propietario: %s\n"
                + "Placa del Automovl: %s\n",
                obtenerNombre(),
                obtenerPlaca()//,
                /*obtenerValorCancelar()*/);
        return cadena;
    }
}
