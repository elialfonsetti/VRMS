/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import interfacce_remote.control.ControllerClienteInterface;
import interfacce_remote.control.ControllerFactoryServerInterface;
import interfacce_remote.control.ControllerLoginInterface;
import interfacce_remote.control.ControllerNoleggioInterface;
import interfacce_remote.control.ControllerPrenotazioneInterface;
import interfacce_remote.control.ControllerRicercaInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Antonio
 */
public class ControllerFactoryServer extends UnicastRemoteObject  implements ControllerFactoryServerInterface {

    public ControllerFactoryServer() throws RemoteException {
    }

    public ControllerLoginInterface getControllerLogin() throws RemoteException {

        return   ControllerLogin.getInstance();
    }

    public ControllerRicercaInterface getControllerRicerca() throws RemoteException {

        return   ControllerRicerca.getInstance();
    }

    public ControllerNoleggioInterface getControllerNoleggio() throws RemoteException {
        return ControllerNoleggio.getInstance();
    }

    public ControllerPrenotazioneInterface getControllerPrenotazione() throws RemoteException {
        return ControllerPrenotazione.getInstance();
    }

    public ControllerClienteInterface getControllerCliente() throws RemoteException {
        return ControllerCliente.getInstance();
    }

}
