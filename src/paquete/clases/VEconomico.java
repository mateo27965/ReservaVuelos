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
public class VEconomico extends Vuelo 
{
 

    public VEconomico(String fechaVuelo, float montoBase, String origen, String destino, String hora) 
    {
        super(fechaVuelo, montoBase, origen, destino, hora);
        montoFinal = this.montoBase;
        
    }

    @Override
    public void CodigoTicket() 
    {
        Random rand = new Random();
        ticket = "ECO" + (rand.nextInt(9999-1000+1)+1000);
    }
    
   

    
    
}
