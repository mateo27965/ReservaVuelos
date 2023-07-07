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
public class GestionPersona 
{
    // arreglo de todos los clientes
    private Cliente[] arreglo;
    private int contador;
    //para tener el usuario que inicio sesion
    private Cliente usuarioSesion;

    public GestionPersona() 
    {
        arreglo = new Cliente[100];
        contador = 0;
    }

    public Cliente[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Cliente[] arreglo) {
        this.arreglo = arreglo;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public Cliente getUsuarioSesion() {
        return usuarioSesion;
    }

    public void setUsuarioSesion(Cliente usuarioSesion) {
        this.usuarioSesion = usuarioSesion;
    }
    
    
    // cargamos usuarios por defecto para que se compruebe el inicio de sesion
    public void CargarUsuarios()
    {
        Cliente obj1 = new Cliente("mateo27965","0000", "Mateo", "De la cruz", 73615223, "13-01-2003", "MASCULINO");
        obj1.GenerarCodigoAleatorioCliente();
        arreglo[contador]=obj1;
        contador++;
        Cliente obj2 = new Cliente("usuario1","0000", "Usuario", "Fuentes", 73615223, "13-01-2000", "MASCULINO");
        obj2.GenerarCodigoAleatorioCliente();
        arreglo[contador]=obj2;
        contador++;

    }
    // para poder validar que esta introduciendo todos los datos que se les pide
    public String ValidarDatos(Cliente usuario)
    {
        String cadena="";
        if(usuario.getNombre().equalsIgnoreCase(""))
        {
            cadena=cadena+"Falta ingresar el nombre."+"\n";
        }
        if(usuario.getApellido().equalsIgnoreCase(""))
        {
            cadena=cadena+"Falta ingresar el apellido."+"\n";
        }
        if(usuario.getDni()<=10000000)
        {
            cadena=cadena+"Verifique que el DNI tenga 8 caracteres."+"\n";
        }
        if(usuario.getFechaNacimiento().equalsIgnoreCase(""))
        {
            cadena=cadena+"Falta ingresar la fecha de nacimiento."+"\n";
        }
        if(usuario.getId().equalsIgnoreCase(""))
        {
            cadena=cadena+"Falta ingresar el usuario."+"\n";
        }
        if(usuario.getClave().equals(""))
        {
            cadena=cadena+"Falta ingresar la clave."+"\n";
        }

        return cadena;
    }
    // para poder registrar al arreglo
    
    public void RegistrarNuevoUsuario(Cliente ref)
    {
        if(contador<arreglo.length)
        {
            String cad=ValidarDatos(ref);
            if(cad.equals(""))
            {
                arreglo[contador]=ref;
                contador++;
                JOptionPane.showMessageDialog(null, "Registrado.");
            }
            else
            {
               JOptionPane.showMessageDialog(null,cad);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"No hay espacio.");
        }
    }
    // para poder iniciar sesion
    public String ValidarUsuario(String id,String clave)
    {
        String valor="";
        int sumador=0;
        for(int i=0;i<contador;i++)
        {
            if(arreglo[i].getId().equalsIgnoreCase(id))
            {
                if(arreglo[i].getClave().equals(clave))
                {
                    valor=arreglo[i].getCodigoCliente();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Clave incorrecta.");
                }
            }
            else
            {
                sumador++;
            }
        }
        if(sumador==contador)
        {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
        }
        return valor;
    }
    
    //saber quien se ha logeado y que pueda ver sus reservas activas
    public Cliente obtenerUsuario(String id,String clave)
    {
        Cliente usuario =null;
        for(int i=0;i<contador;i++)
        {
            if(arreglo[i].getId().equalsIgnoreCase(id))
            {
                if(arreglo[i].getClave().equals(clave))
                {
                    usuario=arreglo[i];
                }  
            }
        }
        
        return usuario;
    }
    
}
