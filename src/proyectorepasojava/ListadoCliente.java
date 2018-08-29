/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectorepasojava;

import java.util.*;

/**
 *
 * @author cetecom
 */
public class ListadoCliente 
{
    private ArrayList<Cliente> AuxListaCliente;

    
    public ListadoCliente()
    {
        this.setAuxListaCliente(new ArrayList<>());
    }
    
    public void agregaCliente(Cliente cliente)
    {
       this.getAuxListaCliente().add(cliente);
    }
    
    public void imprimeClientes()
    {
        Iterator iter = this.getAuxListaCliente().iterator();
        
        while(iter.hasNext())
        {
           Cliente auxCliente = new Cliente();
           auxCliente = (Cliente) iter.next();
           System.out.println(auxCliente.getRut() + " "+
                              auxCliente.getNombre());
        }
    }
    
    
    
    /**
     * @return the AuxListaCliente
     */
    public ArrayList<Cliente> getAuxListaCliente() {
        return AuxListaCliente;
    }

    /**
     * @param AuxListaCliente the AuxListaCliente to set
     */
    public void setAuxListaCliente(ArrayList<Cliente> AuxListaCliente) {
        this.AuxListaCliente = AuxListaCliente;
    }
    
    
}
