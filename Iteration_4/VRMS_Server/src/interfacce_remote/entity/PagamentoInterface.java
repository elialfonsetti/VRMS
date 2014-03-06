/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interfacce_remote.entity;

import java.rmi.RemoteException;

/**
 *
 * @author Antonio
 */
public interface PagamentoInterface {


    public int getBonus_prenotazione() throws RemoteException;
    public void setBonus_prenotazione(int bonus_prenotazione)throws RemoteException;

    public int getMalus_prenotazione() throws RemoteException;

    public void setMalus_prenotazione(int malus_prenotazione) throws RemoteException;

    public int getMalus_restituzione()throws RemoteException;
    public void setMalus_restituzione(int malus_restituzione) throws RemoteException;

    public float CalcolaCosto(DescrizioneInterface d, FormatoInterface f, int n) throws RemoteException;

    public float CalcolaMalusRestituzione(DescrizioneInterface d, FormatoInterface f, int giorni) throws RemoteException;
    public float CalcolaMalusPrenotazione(DescrizioneInterface d, FormatoInterface f, int giorni) throws RemoteException;
}
