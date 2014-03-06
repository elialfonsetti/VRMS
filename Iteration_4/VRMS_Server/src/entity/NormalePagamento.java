package entity;

import interfacce_remote.entity.DescrizioneInterface;
import interfacce_remote.entity.FormatoInterface;
import interfacce_remote.entity.PagamentoInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.orm.PersistentException;

public class NormalePagamento extends UnicastRemoteObject implements PagamentoInterface {
      private int malus_restituzione=1;
      private int malus_prenotazione=1;
      private int bonus_prenotazione=1;

    public NormalePagamento() throws RemoteException {
    }

    public int getMalus_prenotazione() {
        return malus_prenotazione;
    }

    public void setMalus_prenotazione(int malus_prenotazione) {
        this.malus_prenotazione = malus_prenotazione;
    }

    public int getBonus_prenotazione() {
        return bonus_prenotazione;
    }

    public void setBonus_prenotazione(int malus_prenotazione) {
        this.bonus_prenotazione = malus_prenotazione;
    }
    public int getMalus_restituzione() {
        return malus_restituzione;
    }

    public void setMalus_restituzione(int malus_restituzione) {
        this.malus_restituzione = malus_restituzione;
    }
	/**
	 * 
	 * @param t
	 * @return 
	 */

    public float CalcolaCosto(Descrizione d,Formato f,int num_giorni) {
        System.out.print("NORMALE");
           float costo;
           costo= (d.getCosto() +f.getCosto()) *num_giorni;
           return costo;
        }
    public float CalcolaMalusRestituzione(Descrizione d, Formato f, int giorni) {
        float costo;
        costo= (d.getCosto()+ malus_restituzione +f.getCosto())*giorni;
        return costo;
    }
    public float CalcolaMalusPrenotazione(Descrizione d, Formato f, int giorni) {
       return 0;
    }

    public float CalcolaCosto(DescrizioneInterface d, FormatoInterface f, int n) throws RemoteException {
       try {
            Descrizione desc;
            try {
                desc = DescrizioneDAO.loadDescrizioneByORMID(d.getORMID());
                Formato formato = FormatoDAO.getFormatoByORMID(f.getORMID());
                 return this.CalcolaCosto(desc, formato, n);
            } catch (PersistentException ex) {
                Logger.getLogger(NormalePagamento.class.getName()).log(Level.SEVERE, null, ex);
            }


        } catch (RemoteException ex) {
            Logger.getLogger(CompositeCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public float CalcolaMalusRestituzione(DescrizioneInterface d, FormatoInterface f, int giorni) throws RemoteException {
        try {
            return CalcolaMalusRestituzione(DescrizioneDAO.loadDescrizioneByORMID(d.getORMID()), FormatoDAO.loadFormatoByORMID(f.getORMID()), giorni);
        } catch (PersistentException ex) {
            Logger.getLogger(NormalePagamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public float CalcolaMalusPrenotazione(DescrizioneInterface d, FormatoInterface f, int giorni) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}