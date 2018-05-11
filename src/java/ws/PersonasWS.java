/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import entidades.Persona;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author moises
 */
@WebService(serviceName = "PersonasWS")
public class PersonasWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getPersona")
    public Persona getPersona() {
        Date fechaNacimiento = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        try {
            fechaNacimiento = df.parse("18-01-1990");
        } catch (Exception ex) {

        }

        return new Persona("alejandro", "veliz", fechaNacimiento);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getPersonas")
    public List<Persona> getPersonas() {

        ArrayList<Persona> personas = new ArrayList<>();

        Date fechaNacimiento = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        try {
            fechaNacimiento = df.parse("18-01-1990");
        } catch (Exception ex) {

        }
        
        personas.add(new Persona("sebastian", "huenchumilla", fechaNacimiento));
        personas.add(new Persona("rogelio", "lara", fechaNacimiento));
        personas.add(new Persona("ramon", "lorca", fechaNacimiento));
        
        
        

        return personas;
    }

}
