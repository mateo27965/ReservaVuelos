/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.gestion;

import javax.swing.JOptionPane;
import paquete.clases.Reserva;

/**
 *
 * @author Personal
 */
public class GestionReserva 
{
    private Reserva[] arreglo;
    private int contador;
    private GestionVuelo gVuelo;

    public GestionReserva() 
    {
        arreglo = new Reserva[100];
        contador = 0;
        
        gVuelo = new GestionVuelo();
        // CARGO LOS VUELOS QUE ESTAN EN MEMORIA PARA PODER VER EN LAS TABLAS 
        gVuelo.CargarVuelos();
    }

    public Reserva[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Reserva[] arreglo) {
        this.arreglo = arreglo;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public GestionVuelo getgVuelo() {
        return gVuelo;
    }

    public void setgVuelo(GestionVuelo gVuelo) {
        this.gVuelo = gVuelo;
    }
    
    
    
    // VALIDAR BUSQUEDA -BOTON RESERVAR
    public String ValidarDatosReserva(Reserva ref)
    {
        String cad="";
        if(ref.getCodigoTicketIda().equalsIgnoreCase(""))
        {
            cad=cad+"Ingrese el codigo del ticket de ida."+"\n";
        }
        if(ref.getCodigoTicketVuelta().equalsIgnoreCase(""))
        {
            cad = cad + "Ingrese el codigo del ticket de vuelta."+ "\n";
        }
        
        if(ref.getNumeroPasajeros()==0)
        {
            cad = cad + "Seleccione numero de pasajeros." + "\n";
        }
        return cad;
    }
    
    // BOTON RESERVAR
    public void Ingresar(Reserva ref)
    {
        try{
        String cad=ValidarDatosReserva(ref);
        if(contador<arreglo.length)
        {
            if(cad.equalsIgnoreCase(""))
            {
                ref.GenerarCodigoReserva();
                arreglo[contador] = ref;
                contador++;
                JOptionPane.showMessageDialog(null,"Vuelo Reservado.");
            }
            else
            {
                JOptionPane.showMessageDialog(null, cad);
            }
        }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Ocurrió un error" + e.getMessage());
        }
    }
    
    // Buscar reservas activas. Si es igual al codigo de usuario, muestra sus reservas activas.
    public Reserva[] BuscarReservaPorID(String codigo)
    {
        Reserva[] listaReserva = new Reserva[10];
        for(int i=0;i<contador;i++)
        {
            if(arreglo[i].getCodigoCliente().equalsIgnoreCase(codigo))
            {
                listaReserva[contador]= arreglo[i];               
            }
        }
        return listaReserva;
    }
    // RESERVAS ACTIVAS
    // BOTON ELIMINAR
    public void Eliminar(int cod)
    {
        for(int i=0;i<contador;i++)
        {
            if(arreglo[i].getCodigoReserva()==cod)
            {
                for(int j=i;j<contador-1;j++)
                {
                    arreglo[j]=arreglo[j+1];
                }
                arreglo[contador-1]=null;
                contador--;
            }

        }
    }
    //RESERVAS ACTIVAS
    //BOTON ORDENAR POR PRECIO
    public void OrdenarPorPrecio()
    {
        Reserva aux;
        for(int i=0;i<contador-1;i++)
        {
            for(int j=i+1;i<contador;j++)
            {
                if(arreglo[i].getMontoTotal()>arreglo[j].getMontoTotal())
                {
                    aux = arreglo[i];
                    arreglo[i]=arreglo[j];
                    arreglo[j]=aux;
                }
            }
        }
    }
    
}
