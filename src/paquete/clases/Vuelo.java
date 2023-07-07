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
public abstract class Vuelo 
{
    protected String codigoVuelo,matricula,fechaVuelo,ticket;
    protected float montoBase;
    protected String origen,destino;
    protected String hora;
    protected float montoFinal;


    public Vuelo(String fechaVuelo, float montoBase, String origen, String destino, String hora) {
        this.fechaVuelo = fechaVuelo;
        this.montoBase = montoBase;
        this.origen = origen;
        this.destino = destino;
        this.hora = hora;
    }
    
    public Vuelo()
    {
        
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFechaVuelo() {
        return fechaVuelo;
    }

    public void setFechaVuelo(String fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    public float getMontoBase() {
        return montoBase;
    }

    public void setMontoBase(float montoBase) {
        this.montoBase = montoBase;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }


    public float getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(float montoFinal) {
        this.montoFinal = montoFinal;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }
    

    
    
    public void GenerarCodigoVuelo()
    {
        Random rand = new Random();
        codigoVuelo = (rand.nextInt(999-100+1)+100) + "LTM";
    }
    public void GenerarMatricula()
    {
        Random rand = new Random();
        matricula = "REF-" + (rand.nextInt(800-500+1)+500);
    }
    
    
    
    public abstract void CodigoTicket();
    
    
}
