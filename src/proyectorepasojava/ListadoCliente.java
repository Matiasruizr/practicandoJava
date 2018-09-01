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
    
    public String imprimeClientes()
    {
        Iterator iter = this.getAuxListaCliente().iterator();
        
        String lista = " ";
        while(iter.hasNext())
        {
           Cliente auxCliente = new Cliente();
           auxCliente = (Cliente) iter.next();
           lista = auxCliente.getRut() + " "+ auxCliente.getNombre() +"\n";
            
        }
        return lista;
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
