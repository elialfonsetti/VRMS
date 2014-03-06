/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interfacce_remote.control;



import interfacce_remote.entity.CassiereInterface;
import interfacce_remote.entity.ClienteInterface;
import interfacce_remote.entity.TerminaleInterface;
import java.rmi.Remote;
import java.rmi.RemoteException;


/**
 *
 * @author Antonio
 */
public interface ControllerLoginInterface extends Remote {



    public  ClienteInterface getCliente(String t)  throws RemoteException;
    public  void setCliente(ClienteInterface cliente) throws RemoteException;
    public int getN_noleggi(String id_t) throws RemoteException;
    public void setN_noleggi(int n) throws RemoteException;
    public void Login(String codice, String terminale) throws RemoteException;
    public int contaNoleggi(String id_t) throws RemoteException;
    public void Logout(String ter)throws RemoteException;
    public TerminaleInterface CaricaTerminale() throws  RemoteException ;
    public CassiereInterface getCassiere(String terminale) throws  RemoteException ;
    public  void setCassiere(CassiereInterface cassiere,String terminale) throws  RemoteException ;
    public void LoginCassiere(String pin,String terminale) throws Exception, RemoteException;
    public void LogoutCassiere(String terminale) throws Exception,RemoteException;

}
