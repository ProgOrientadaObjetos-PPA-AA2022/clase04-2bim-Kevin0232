/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.ArrayList;
import paquete2.*;
import paquete3.ArriendoLocalComercial;
import paquete3.ArriendoLocalComida;
import paquete3.ArriendoLocalSesiones;

public class Ejecutor {
    public static void main(String[] args) {
        
        ArrayList<Arriendo> listaArriendos = new ArrayList<>();
        Propietario p1 = new Propietario("Christian","Shepherd", 30 );
        ArriendoLocalComida arriendoComida = new ArriendoLocalComida(
                p1, 300);
        arriendoComida.establecerIva(10); // en porcentaje
        arriendoComida.establecerValorAgua(20.2); // en $
        arriendoComida.establecerValorLuz(40.2); // en $
        
        Propietario p2 = new Propietario("Andrew","Schroeder", 35 );
        ArriendoLocalComercial arriendoComercial = new ArriendoLocalComercial(
                p2, 400);
        arriendoComercial.establecerValorAdicionalFijo(100); // en $
        
        Propietario p3 = new Propietario("Angela","Watson", 40 );
        ArriendoLocalSesiones arriendoSesiones = new ArriendoLocalSesiones(
                p3, 350);
        arriendoSesiones.establecerValorSillas(10); // en $
        arriendoSesiones.establecerValorAmplificacion(20); // en $
        
        listaArriendos.add(arriendoComida);
        listaArriendos.add(arriendoComercial);
        listaArriendos.add(arriendoSesiones);
        
        for (int i = 0; i < listaArriendos.size(); i++) {
            listaArriendos.get(i).establecerArriendoMensual();
        }
        
        CentroComercial centro = new CentroComercial("La Pradera", 
                listaArriendos);
        centro.establecerTotalArriendosBaseMensual();
        centro.establecerTotalArriendosFinalMensual();
        System.out.println(centro);
    
    }
}
