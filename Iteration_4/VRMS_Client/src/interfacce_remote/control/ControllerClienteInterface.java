/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interfacce_remote.control;

import interfacce_remote.entity.ClienteInterface;
import interfacce_remote.entity.TesseraInterface;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Antonio
 */
public interface ControllerClienteInterface extends Remote {


    public ClienteInterface getCliente(String terminale) throws Exception, RemoteException;

    public void setCliente(ClienteInterface cliente,String terminale ) throws Exception, RemoteException;

    public void NuovoCliente(ClienteInterface cliente,TesseraInterface tessera)throws Exception, RemoteException;

    public ClienteInterface CercaCliente(String cod) throws Exception, RemoteException;

    public void ModificaCliente(ClienteInterface cliente) throws Exception, RemoteException;
    public void ModificaTessera(TesseraInterface tessera)throws Exception, RemoteException;
    public ClienteInterface CercaTessera(String text) throws Exception, RemoteException;
    public ClienteInterface CreaCliente()throws RemoteException;
    public TesseraInterface CreaTessera()throws RemoteException;
    public boolean CheckNoleggi(String terminale) throws Exception, RemoteException;

}
