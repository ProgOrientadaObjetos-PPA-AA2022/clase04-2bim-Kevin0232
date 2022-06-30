/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilGasolina extends Automovil{
    private double numMaxGalon;
    private double costoGalon;
    private double iva;
    private double valorTotal;
    public AutomovilGasolina(String n, String p, double ng, double cg){
       nombreP = n;
       placa = p;
       numMaxGalon = ng;
       costoGalon = cg;
    }
    public void establecerNumeroGalones(double c){
        numMaxGalon = c;
    }
    public void establecerCostoGalon(double c){
        costoGalon = c;
    }
    public void establecerIva(){
        iva = ((costoGalon) * (numMaxGalon)* 0.1);
    }
    public void establecerValorTotal(){
        valorTotal = (costoGalon *numMaxGalon);
    }
    @Override
    public void calcularValorCancelar(){
        valorCancelar = valorTotal + iva;
    }
    public double obtenerNumeroGalones(){
        return numMaxGalon;
    }
    public double CostoGalon(){
        return costoGalon;
    }
    public double obtenerIva(){
        return iva;
    }
    public double obtenerVAlorTotal(){
        return valorTotal;
    }
    
    @Override
    public String toString(){
        String cadena2 = String.format("%s", super.toString());
        String cadena = String.format("Numero Maximo de Galones: %.2f\n"
                + "Costo Maximo de Galones: %.2f\n"
                + "Iva: %.2f\n" 
                + "Valor Total: %.2f\n"
                + "Valor Total a Cancelar: %.2f\n",
                obtenerNumeroGalones(),
                CostoGalon(),
                obtenerIva(),
                obtenerVAlorTotal(),
                obtenerValorCancelar());
        return cadena;
    }
}
