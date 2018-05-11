/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author moises
 */
public class Persona {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido.toString();
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento.toString();
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    private String nombre;

    public Persona(String nombre, String apellido, Date fecha_nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
    }
    private String apellido;

    public Persona() {
    }
    private Date fecha_nacimiento;
    
    public int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }
    
}
