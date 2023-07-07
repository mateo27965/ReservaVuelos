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
public class Reserva
{
    private int codigoReserva;
    private String codigoCliente;
    private String codigovueloIda,codigovueloRetorno;
    private String codigoTicketIda,codigoTicketVuelta;
    private int numeroPasajeros;
    private String ticket;
    private float montoTotal;


    public Reserva(String codigoCliente, int numeroPasajeros) {
        this.codigoCliente = codigoCliente;
        this.numeroPasajeros = numeroPasajeros;

    }

    public int getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(int codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getCodigovueloIda() {
        return codigovueloIda;
    }

    public void setCodigovueloIda(String codigovueloIda) {
        this.codigovueloIda = codigovueloIda;
    }

    public String getCodigovueloRetorno() {
        return codigovueloRetorno;
    }

    public void setCodigovueloRetorno(String codigovueloRetorno) {
        this.codigovueloRetorno = codigovueloRetorno;
    }


    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }


    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getCodigoTicketIda() {
        return codigoTicketIda;
    }

    public void setCodigoTicketIda(String codigoTicketIda) {
        this.codigoTicketIda = codigoTicketIda;
    }

    public String getCodigoTicketVuelta() {
        return codigoTicketVuelta;
    }

    public void setCodigoTicketVuelta(String codigoTicketVuelta) {
        this.codigoTicketVuelta = codigoTicketVuelta;
    }
    
    
    
    
    public void GenerarCodigoReserva()
    {
        Random rand = new Random();
        this.codigoReserva = rand.nextInt(70000-10000+1)+10000;
    }
    
    
    
}
