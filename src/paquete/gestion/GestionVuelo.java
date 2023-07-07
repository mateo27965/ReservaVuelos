/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.gestion;

import javax.swing.JOptionPane;
import paquete.clases.*;

/**
 *
 * @author Personal
 */
public class GestionVuelo 
{
    private Vuelo[] arreglo;
    private int contador;

    public GestionVuelo() 
    {
        arreglo = new Vuelo[100];
        contador = 0;
    }

    public Vuelo[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Vuelo[] arreglo) {
        this.arreglo = arreglo;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    public void CargarVuelos()
    {
        VEconomico obj1 = new VEconomico("13-07-2022", 100, "LIMA", "CUZCO", "05:00");
        obj1.GenerarCodigoVuelo();
        obj1.GenerarMatricula();
        obj1.CodigoTicket();
        arreglo[contador]=obj1;
        contador++;
        VPremium obj2 = new VPremium("13-07-2022", 100, "LIMA", "CUZCO", "05:00");
        obj2.CalcularPrecioBase();
        obj2.setCodigoVuelo(obj1.getCodigoVuelo());
        obj2.setMatricula(obj1.getMatricula());
        obj2.CodigoTicket();
        arreglo[contador]=obj2;
        contador++;
        VBusiness obj3 = new VBusiness("13-07-2022", 100, "LIMA", "CUZCO", "05:00");
        obj3.CalcularPrecioBase();
        obj3.setCodigoVuelo(obj1.getCodigoVuelo());
        obj3.setMatricula(obj1.getMatricula());
        obj3.CodigoTicket();
        arreglo[contador]=obj3;
        contador++;
        VEconomico obj4 = new VEconomico("18-07-2022", 100, "CUZCO", "LIMA", "18:00");
        obj4.GenerarCodigoVuelo();
        obj4.GenerarMatricula();
        obj4.CodigoTicket();
        arreglo[contador]=obj4;
        contador++;
        VPremium obj5 = new VPremium("18-07-2022", 100, "CUZCO", "LIMA", "18:00");
        obj5.CalcularPrecioBase();
        obj5.setCodigoVuelo(obj4.getCodigoVuelo());
        obj5.setMatricula(obj4.getMatricula());
        obj5.CodigoTicket();
        arreglo[contador]=obj5;
        contador++;
        VBusiness obj6 = new VBusiness("18-07-2022", 100, "CUZCO", "LIMA", "18:00");
        obj6.CalcularPrecioBase();
        obj6.setCodigoVuelo(obj4.getCodigoVuelo());
        obj6.setMatricula(obj4.getMatricula());
        obj6.CodigoTicket();
        arreglo[contador]=obj6;
        contador++;
        
        
        VEconomico obj7 = new VEconomico("15-07-2022", 70, "LIMA", "CAJAMARCA", "07:00");
        obj7.GenerarCodigoVuelo();
        obj7.GenerarMatricula();
        obj7.CodigoTicket();
        arreglo[contador]=obj7;
        contador++;
        VPremium obj8 = new VPremium("15-07-2022", 70, "LIMA", "CAJAMARCA", "07:00");
        obj8.CalcularPrecioBase();
        obj8.setCodigoVuelo(obj7.getCodigoVuelo());
        obj8.setMatricula(obj7.getMatricula());
        obj8.CodigoTicket();
        arreglo[contador]=obj8;
        contador++;
        VBusiness obj9 = new VBusiness("15-07-2022", 70, "LIMA", "CAJAMARCA", "07:00");
        obj9.CalcularPrecioBase();
        obj9.setCodigoVuelo(obj7.getCodigoVuelo());
        obj9.setMatricula(obj7.getMatricula());
        obj9.CodigoTicket();
        arreglo[contador]=obj9;
        contador++;
        VEconomico obj10 = new VEconomico("20-07-2022", 70, "CAJAMARCA", "LIMA", "19:00");
        obj10.GenerarCodigoVuelo();
        obj10.GenerarMatricula();
        obj10.CodigoTicket();
        arreglo[contador]=obj10;
        contador++;
        VPremium obj11 = new VPremium("20-07-2022", 70, "CAJAMARCA", "LIMA", "19:00");
        obj11.CalcularPrecioBase();
        obj11.setCodigoVuelo(obj10.getCodigoVuelo());
        obj11.setMatricula(obj10.getMatricula());
        obj11.CodigoTicket();
        arreglo[contador]=obj11;
        contador++;
        VBusiness obj12 = new VBusiness("20-07-2022", 70, "CAJAMARCA", "LIMA", "19:00");
        obj12.CalcularPrecioBase();
        obj12.setCodigoVuelo(obj10.getCodigoVuelo());
        obj12.setMatricula(obj10.getMatricula());
        obj12.CodigoTicket();
        arreglo[contador]=obj12;
        contador++;
        VEconomico obj13 = new VEconomico("15-07-2022", 90, "LIMA", "AREQUIPA", "08:00");
        obj13.GenerarCodigoVuelo();
        obj13.GenerarMatricula();
        obj13.CodigoTicket();
        arreglo[contador]=obj13;
        contador++;
        VPremium obj14 = new VPremium("15-07-2022", 90, "LIMA", "AREQUIPA", "08:00");
        obj14.CalcularPrecioBase();
        obj14.setCodigoVuelo(obj13.getCodigoVuelo());
        obj14.setMatricula(obj13.getMatricula());
        obj14.CodigoTicket();
        arreglo[contador]=obj14;
        contador++;
        VBusiness obj15 = new VBusiness("15-07-2022", 90, "LIMA", "AREQUIPA", "08:00");
        obj15.CalcularPrecioBase();
        obj15.setCodigoVuelo(obj13.getCodigoVuelo());
        obj15.setMatricula(obj13.getMatricula());
        obj15.CodigoTicket();
        arreglo[contador]=obj15;
        contador++;
        VEconomico obj16 = new VEconomico("20-07-2022", 90, "AREQUIPA", "LIMA", "15:00");
        obj16.GenerarCodigoVuelo();
        obj16.GenerarMatricula();
        obj16.CodigoTicket();
        arreglo[contador]=obj16;
        contador++;
        VPremium obj17 = new VPremium("20-07-2022", 90, "AREQUIPA", "LIMA", "15:00");
        obj17.CalcularPrecioBase();
        obj17.setCodigoVuelo(obj16.getCodigoVuelo());
        obj17.setMatricula(obj16.getMatricula());
        obj17.CodigoTicket();
        arreglo[contador]=obj17;
        contador++;
        VBusiness obj18 = new VBusiness("20-07-2022", 90, "AREQUIPA", "LIMA", "15:00");
        obj18.CalcularPrecioBase();
        obj18.setCodigoVuelo(obj16.getCodigoVuelo());
        obj18.setMatricula(obj16.getMatricula());
        obj18.CodigoTicket();
        arreglo[contador]=obj18;
        contador++;
        VEconomico obj19 = new VEconomico("15-07-2022", 78, "LIMA", "CHICLAYO", "11:00");
        obj19.GenerarCodigoVuelo();
        obj19.GenerarMatricula();
        obj19.CodigoTicket();
        arreglo[contador]=obj19;
        contador++;
        VPremium obj20 = new VPremium("15-07-2022", 78, "LIMA", "CHICLAYO", "11:00");
        obj20.CalcularPrecioBase();
        obj20.setCodigoVuelo(obj19.getCodigoVuelo());
        obj20.setMatricula(obj19.getMatricula());
        obj20.CodigoTicket();
        arreglo[contador]=obj20;
        contador++;
        VBusiness obj21 = new VBusiness("15-07-2022", 78, "LIMA", "CHICLAYO", "11:00");
        obj21.CalcularPrecioBase();
        obj21.setCodigoVuelo(obj19.getCodigoVuelo());
        obj21.setMatricula(obj19.getMatricula());
        obj21.CodigoTicket();
        arreglo[contador]=obj21;
        contador++;
        VEconomico obj22 = new VEconomico("20-07-2022", 78, "CHICLAYO", "LIMA", "22:00");
        obj22.GenerarCodigoVuelo();
        obj22.GenerarMatricula();
        obj22.CodigoTicket();
        arreglo[contador]=obj22;
        contador++;
        VPremium obj23 = new VPremium("20-07-2022", 78, "CHICLAYO", "LIMA", "22:00");
        obj23.CalcularPrecioBase();
        obj23.setCodigoVuelo(obj22.getCodigoVuelo());
        obj23.setMatricula(obj22.getMatricula());
        obj23.CodigoTicket();
        arreglo[contador]=obj23;
        contador++;
        VBusiness obj24 = new VBusiness("20-07-2022", 78, "CHICLAYO", "LIMA", "22:00");
        obj24.CalcularPrecioBase();
        obj24.setCodigoVuelo(obj22.getCodigoVuelo());
        obj24.setMatricula(obj22.getMatricula());
        obj24.CodigoTicket();
        arreglo[contador]=obj24;
        contador++;
        VEconomico obj25 = new VEconomico("15-07-2022", 95, "LIMA", "TARAPOTO", "11:30");
        obj25.GenerarCodigoVuelo();
        obj25.GenerarMatricula();
        obj25.CodigoTicket();
        arreglo[contador]=obj25;
        contador++;
        VPremium obj26 = new VPremium("15-07-2022", 95, "LIMA", "TARAPOTO", "11:30");
        obj26.CalcularPrecioBase();
        obj26.setCodigoVuelo(obj25.getCodigoVuelo());
        obj26.setMatricula(obj25.getMatricula());
        obj26.CodigoTicket();
        arreglo[contador]=obj26;
        contador++;
        VBusiness obj27 = new VBusiness("15-07-2022", 95, "LIMA", "TARAPOTO", "11:30");
        obj27.CalcularPrecioBase();
        obj27.setCodigoVuelo(obj25.getCodigoVuelo());
        obj27.setMatricula(obj25.getMatricula());
        obj27.CodigoTicket();
        arreglo[contador]=obj27;
        contador++;
        VEconomico obj28 = new VEconomico("20-07-2022", 95, "TARAPOTO", "LIMA", "23:00");
        obj28.GenerarCodigoVuelo();
        obj28.GenerarMatricula();
        obj28.CodigoTicket();
        arreglo[contador]=obj28;
        contador++;
        VPremium obj29 = new VPremium("20-07-2022", 95, "TARAPOTO", "LIMA", "23:00");
        obj29.CalcularPrecioBase();
        obj29.setCodigoVuelo(obj28.getCodigoVuelo());
        obj29.setMatricula(obj28.getMatricula());
        obj29.CodigoTicket();
        arreglo[contador]=obj29;
        contador++;
        VBusiness obj30 = new VBusiness("20-07-2022", 95, "TARAPOTO", "LIMA", "23:00");
        obj30.CalcularPrecioBase();
        obj30.setCodigoVuelo(obj28.getCodigoVuelo());
        obj30.setMatricula(obj28.getMatricula());
        obj30.CodigoTicket();
        arreglo[contador]=obj30;
        contador++;
        
        
        
        VEconomico obj31 = new VEconomico("16-07-2022", 93, "CUZCO", "AREQUIPA", "07:00");
        obj31.GenerarCodigoVuelo();
        obj31.GenerarMatricula();
        obj31.CodigoTicket();
        arreglo[contador]=obj31;
        contador++;
        VPremium obj32 = new VPremium("16-07-2022", 93, "CUZCO", "AREQUIPA", "07:00");
        obj32.CalcularPrecioBase();
        obj32.setCodigoVuelo(obj31.getCodigoVuelo());
        obj32.setMatricula(obj31.getMatricula());
        obj32.CodigoTicket();
        arreglo[contador]=obj32;
        contador++;
        VBusiness obj33 = new VBusiness("16-07-2022", 93, "CUZCO", "AREQUIPA", "07:00");
        obj33.CalcularPrecioBase();
        obj33.setCodigoVuelo(obj31.getCodigoVuelo());
        obj33.setMatricula(obj31.getMatricula());
        obj33.CodigoTicket();
        arreglo[contador]=obj33;
        contador++;
        VEconomico obj34 = new VEconomico("21-07-2022", 93, "AREQUIPA", "CUZCO", "20:00");
        obj34.GenerarCodigoVuelo();
        obj34.GenerarMatricula();
        obj34.CodigoTicket();
        arreglo[contador]=obj34;
        contador++;
        VPremium obj35 = new VPremium("21-07-2022", 93, "AREQUIPA", "CUZCO", "20:00");
        obj35.CalcularPrecioBase();
        obj35.setCodigoVuelo(obj34.getCodigoVuelo());
        obj35.setMatricula(obj34.getMatricula());
        obj35.CodigoTicket();
        arreglo[contador]=obj35;
        contador++;
        VBusiness obj36 = new VBusiness("21-07-2022", 93, "AREQUIPA", "CUZCO", "20:00");
        obj36.CalcularPrecioBase();
        obj36.setCodigoVuelo(obj35.getCodigoVuelo());
        obj36.setMatricula(obj35.getMatricula());
        obj36.CodigoTicket();
        arreglo[contador]=obj36;
        contador++;
        
        
        
        VEconomico obj37 = new VEconomico("16-07-2022", 93, "CUZCO", "CHICLAYO", "09:00");
        obj37.GenerarCodigoVuelo();
        obj37.GenerarMatricula();
        obj37.CodigoTicket();
        arreglo[contador]=obj37;
        contador++;
        VPremium obj38 = new VPremium("16-07-2022", 93, "CUZCO", "CHICLAYO", "09:00");
        obj38.CalcularPrecioBase();
        obj38.setCodigoVuelo(obj37.getCodigoVuelo());
        obj38.setMatricula(obj37.getMatricula());
        obj38.CodigoTicket();
        arreglo[contador]=obj38;
        contador++;
        VBusiness obj39 = new VBusiness("16-07-2022", 93, "CUZCO", "CHICLAYO", "09:00");
        obj39.CalcularPrecioBase();
        obj39.setCodigoVuelo(obj37.getCodigoVuelo());
        obj39.setMatricula(obj37.getMatricula());
        obj39.CodigoTicket();
        arreglo[contador]=obj39;
        contador++;
        VEconomico obj40 = new VEconomico("21-07-2022", 93, "CHICLAYO", "CUZCO", "18:00");
        obj40.GenerarCodigoVuelo();
        obj40.GenerarMatricula();
        obj40.CodigoTicket();
        arreglo[contador]=obj40;
        contador++;
        VPremium obj41 = new VPremium("21-07-2022", 93, "CHICLAYO", "CUZCO", "18:00");
        obj41.CalcularPrecioBase();
        obj41.setCodigoVuelo(obj40.getCodigoVuelo());
        obj41.setMatricula(obj40.getMatricula());
        obj41.CodigoTicket();
        arreglo[contador]=obj41;
        contador++;
        VBusiness obj42 = new VBusiness("21-07-2022", 93, "CHICLAYO", "CUZCO", "18:00");
        obj42.CalcularPrecioBase();
        obj42.setCodigoVuelo(obj40.getCodigoVuelo());
        obj42.setMatricula(obj40.getMatricula());
        obj42.CodigoTicket();
        arreglo[contador]=obj42;
        contador++;
        
        
        
        
        VEconomico obj43 = new VEconomico("16-07-2022", 89, "CUZCO", "TARAPOTO", "05:45");
        obj43.GenerarCodigoVuelo();
        obj43.GenerarMatricula();
        obj43.CodigoTicket();
        arreglo[contador]=obj43;
        contador++;
        VPremium obj44 = new VPremium("16-07-2022", 89, "CUZCO", "TARAPOTO", "05:45");
        obj44.CalcularPrecioBase();
        obj44.setCodigoVuelo(obj43.getCodigoVuelo());
        obj44.setMatricula(obj43.getMatricula());
        obj44.CodigoTicket();
        arreglo[contador]=obj44;
        contador++;
        VBusiness obj45 = new VBusiness("16-07-2022", 89, "CUZCO", "TARAPOTO", "05:45");
        obj45.CalcularPrecioBase();
        obj45.setCodigoVuelo(obj43.getCodigoVuelo());
        obj45.setMatricula(obj43.getMatricula());
        obj45.CodigoTicket();
        arreglo[contador]=obj45;
        contador++;
        VEconomico obj46 = new VEconomico("21-07-2022", 89, "TARAPOTO", "CUZCO", "19:50");
        obj46.GenerarCodigoVuelo();
        obj46.GenerarMatricula();
        obj46.CodigoTicket();
        arreglo[contador]=obj46;
        contador++;
        VPremium obj47 = new VPremium("21-07-2022", 93, "TARAPOTO", "CUZCO", "19:50");
        obj47.CalcularPrecioBase();
        obj47.setCodigoVuelo(obj46.getCodigoVuelo());
        obj47.setMatricula(obj46.getMatricula());
        obj47.CodigoTicket();
        arreglo[contador]=obj47;
        contador++;
        VBusiness obj48 = new VBusiness("21-07-2022", 93, "TARAPOTO", "CUZCO", "19:50");
        obj48.CalcularPrecioBase();
        obj48.setCodigoVuelo(obj46.getCodigoVuelo());
        obj48.setMatricula(obj46.getMatricula());
        obj48.CodigoTicket();
        arreglo[contador]=obj48;
        contador++;

        
        VEconomico obj49 = new VEconomico("16-07-2022", 99, "CUZCO", "LIMA", "05:45");
        obj49.GenerarCodigoVuelo();
        obj49.GenerarMatricula();
        obj49.CodigoTicket();
        arreglo[contador]=obj49;
        contador++;
        VPremium obj50 = new VPremium("16-07-2022", 99, "CUZCO", "LIMA", "05:45");
        obj50.CalcularPrecioBase();
        obj50.setCodigoVuelo(obj49.getCodigoVuelo());
        obj50.setMatricula(obj49.getMatricula());
        obj50.CodigoTicket();
        arreglo[contador]=obj50;
        contador++;
        VBusiness obj51 = new VBusiness("16-07-2022", 99, "CUZCO", "LIMA", "05:45");
        obj51.CalcularPrecioBase();
        obj51.setCodigoVuelo(obj49.getCodigoVuelo());
        obj51.setMatricula(obj49.getMatricula());
        obj51.CodigoTicket();
        arreglo[contador]=obj51;
        contador++;
        VEconomico obj52 = new VEconomico("21-07-2022", 120, "LIMA", "CUZCO", "20:50");
        obj52.GenerarCodigoVuelo();
        obj52.GenerarMatricula();
        obj52.CodigoTicket();
        arreglo[contador]=obj52;
        contador++;
        VPremium obj53 = new VPremium("21-07-2022", 120, "LIMA", "CUZCO", "20:50");
        obj53.CalcularPrecioBase();
        obj53.setCodigoVuelo(obj52.getCodigoVuelo());
        obj53.setMatricula(obj52.getMatricula());
        obj53.CodigoTicket();
        arreglo[contador]=obj53;
        contador++;
        VBusiness obj54 = new VBusiness("21-07-2022", 120, "LIMA", "CUZCO", "20:50");
        obj54.CalcularPrecioBase();
        obj54.setCodigoVuelo(obj52.getCodigoVuelo());
        obj54.setMatricula(obj52.getMatricula());
        obj54.CodigoTicket();
        arreglo[contador]=obj54;
        contador++;
    }
    
    // BOTON BUSCAR
    public Vuelo[] BuscarVuelos(String origen,String destino,String fecha)
    {
        Vuelo[] vuelos= new Vuelo[10] ;
        int pos=0;
        for(int i=0;i<contador;i++)
        {
            Vuelo obj = arreglo[i];
            if(arreglo[i].getOrigen().equalsIgnoreCase(origen) && arreglo[i].getDestino().equalsIgnoreCase(destino)&& arreglo[i].getFechaVuelo().equalsIgnoreCase(fecha))
            {
                vuelos[pos] = obj;
                pos++;
            }
        }
        if (vuelos.length == 0)
        {
            JOptionPane.showMessageDialog(null,"Vuelo no encontrado.");
        }
        return vuelos;
        
    }
    
    public Vuelo BuscarVueloActivo(String codigoVuelo, String numTicket)
    {
        Vuelo vuelo = null;
        
        for(int i=0;i<contador;i++)
        {
            Vuelo obj = arreglo[i];
            if(arreglo[i].getCodigoVuelo().equalsIgnoreCase(codigoVuelo) && arreglo[i].getTicket().equalsIgnoreCase(numTicket))
            {
                vuelo = obj;
                break;
            }
        }  
        return vuelo;
    }

    
    
    
}
