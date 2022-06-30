/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;
import paquete02.Automovil;
/**
 *
 * @author reroes
 */
public class AutomovilDiesel extends Automovil{
    private double numMaxLitros;
    private double costoLitro;
    private double descuentoLitros;
    private double valorTotal;
    public AutomovilDiesel(String n, String p, double nl, double cl, double i){
       nombreP = n;
       placa = p;
       numMaxLitros = nl;
       costoLitro = cl;
       establecerDescuentoLitro(i);
    }
    public void establecerNumeroGalones(double c){
        numMaxLitros = c;
    }
    public void establecerCostoGalon(double c){
        costoLitro = c;
    }
    public void establecerDescuentoLitro(double c){
        descuentoLitros = ( numMaxLitros * (c/100));
    }
    public void establecerValorTotal(){
        valorTotal = costoLitro*numMaxLitros;
    }
    @Override
    public void calcularValorCancelar(){
        valorCancelar = (costoLitro *(numMaxLitros-descuentoLitros));
    }
    public double obtenerNumeroGalones(){
        return numMaxLitros;
    }
    public double CostoGalon(){
        return costoLitro;
    }
    public double obtenerDescuentoLitros(){
        return descuentoLitros;
    }
    public double obtenerValorTotal(){
        return valorTotal;
    }
    @Override
    public String toString(){
        String cadena2 = String.format("%s", super.toString());
        String cadena = String.format("Numero Maximo de Litros: %.2f\n"
                + "Costo Maximo de Litros: %.2f\n"
                + "Descuento en Litros: %.2f\n"
                + "Valor Total a Cancelar: %.2f\n",
                obtenerNumeroGalones(),
                CostoGalon(),
                obtenerDescuentoLitros(),
                obtenerValorCancelar());
        return cadena;
    }
}
