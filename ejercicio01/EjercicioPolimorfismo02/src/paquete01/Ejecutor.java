/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;
import paquete02.*;
import paquete03.*;
import paquete04.*;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        AutomovilGasolina ag = new AutomovilGasolina("Pedro Picapiedra", "LCD-385", 20,3); 
        ag.establecerIva();
        ag.establecerValorTotal();
        ag.calcularValorCancelar();
        
        System.out.println("----------------------");
        System.out.println(ag);
        AutomovilDiesel ad = new AutomovilDiesel("Sancho Panza", "LGE-323", 20,2,10); 
        ag.establecerValorTotal();
        ad.calcularValorCancelar();
        System.out.println("----------------------");
        System.out.println(ad);
    }
}
