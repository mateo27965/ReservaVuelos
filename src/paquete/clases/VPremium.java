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
public class VPremium extends Vuelo implements PrecioBase
{

    public VPremium(String fechaVuelo, float montoBase, String origen, String destino, String hora) 
    {
        super(fechaVuelo, montoBase, origen, destino, hora);
        
    }

    @Override
    public void CodigoTicket() 
    {
        Random rand = new Random();
        ticket = "PRM" + (rand.nextInt(9999-1000+1)+1000);
    }

    @Override
    public void CalcularPrecioBase() 
    {
        this.montoFinal=1.3f*montoBase;
    }
    
    
    
    
    
    
}
