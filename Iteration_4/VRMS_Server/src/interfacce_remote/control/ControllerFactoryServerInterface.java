/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interfacce_remote.control;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Antonio
 */
public interface ControllerFactoryServerInterface extends Remote {

    public ControllerLoginInterface getControllerLogin() throws RemoteException;
    public ControllerRicercaInterface getControllerRicerca() throws RemoteException;
    public ControllerNoleggioInterface getControllerNoleggio() throws RemoteException;
    public ControllerPrenotazioneInterface getControllerPrenotazione()throws RemoteException;
    public ControllerClienteInterface getControllerCliente()throws RemoteException;
    

}
