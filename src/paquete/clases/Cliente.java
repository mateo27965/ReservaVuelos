/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

import java.util.Random;

/**
 *
 * @author Personal
 */
public class Cliente extends Persona
{
    private String codigoCliente;
    private String id, clave;

    public Cliente(String id, String clave, String nombre, String apellido, int dni, String fechaNacimiento, String sexo) {
        super(nombre, apellido, dni, fechaNacimiento, sexo);
        this.id = id;
        this.clave = clave;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

   
    
    public void GenerarCodigoAleatorioCliente()
    {
        Random rand = new Random();
        this.codigoCliente = "U-" + rand.nextInt(9999-1000+1)+1000;
    }
    
}
