/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public abstract class Arriendo {
    
    protected Propietario arrendatario;
    protected double arriendoMensual;
    protected double cuotaBase;
    
    public Arriendo(Propietario a, double cuotaB){
        // nombreArrendatario = nombre;
        establecerArrendatario(a);
        cuotaBase = cuotaB;
    }
    
    public void establecerArrendatario(Propietario a){
        arrendatario = a;
    }
    
    public void establecerCuotaBase(double x){
        cuotaBase = x;
    }
    
    public abstract void establecerArriendoMensual();
    
    public Propietario obtenerArrendatario(){
        return arrendatario;
    }
    
    public double obtenerCuotaBase(){
        return cuotaBase;
    }
    
    public double obtenerArriendoMensual(){
        return arriendoMensual;
    }
    
    
}
