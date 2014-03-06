/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interfacce_remote.entity;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;


/**
 *
 * @author Utente
 */
public interface ProdottoInterface extends Remote {
    public void define( String titolo, int durata, String genere, String formato, int anno )throws RemoteException;
    public String getTitolo()throws RemoteException;
    public String getGenere()throws RemoteException;
    public String getFormato()throws RemoteException;
    public int getDurata()throws RemoteException;
    public int getAnno()throws RemoteException;
    public int getID()throws RemoteException;
    public ArrayList<ProdottoInterface> ListaFilm(String text) throws RemoteException;

    public ProdottoInterface ottieniFilmOrdinato(int id)throws RemoteException;



}
