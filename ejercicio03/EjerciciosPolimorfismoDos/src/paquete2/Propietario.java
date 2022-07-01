/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author SALA I
 */
public class Propietario {

    private String nombre;
    private String apellido;
    private int edad;

    public Propietario(String n, String a, int e) {
        nombre = n;
        apellido = a;
        edad = e;
    }

    public void establecerApellido(String c) {
        apellido = c;
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerEdad(int c) {
        edad = c;
    }

    public int obtenerEdad() {
        return edad;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre del arrendatario: %s\n"
                + "Apellido del arrendatario: %s\n"
                + "Edad del arrendatario: %d", 
                obtenerNombre(),
                obtenerApellido(),
                obtenerEdad());
        return cadena;
    }
    
    
}
