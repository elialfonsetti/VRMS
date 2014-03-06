package entity;

import interfacce_remote.entity.DescrizioneInterface;
import interfacce_remote.entity.FormatoInterface;
import interfacce_remote.entity.PagamentoInterface;
import java.rmi.RemoteException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.orm.PersistentException;

public class CompositeCustomer extends CompositePagamento {

      private int malus_restituzione=1;
      private int malus_prenotazione=1;
      private int bonus_prenotazione=1;

    public CompositeCustomer() throws RemoteException {
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
    public float CalcolaCosto(DescrizioneInterface d, FormatoInterface f, int n)
    {
        try {
            Descrizione desc;
            try {
                desc = DescrizioneDAO.loadDescrizioneByORMID(d.getORMID());
                Formato formato = FormatoDAO.getFormatoByORMID(f.getORMID());
                 return this.CalcolaCosto(desc, formato, n);
            } catch (PersistentException ex) {
                Logger.getLogger(CompositeCustomer.class.getName()).log(Level.SEVERE, null, ex);
            }


        } catch (RemoteException ex) {
            Logger.getLogger(CompositeCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
 }
    public float CalcolaCosto(Descrizione d, Formato f, int n){
       
          
            float costo = 0;
            Iterator<PagamentoInterface> it = pagamenti.iterator();
            int i = 0;
            while (it.hasNext()) {
            try {
                PagamentoInterface p = it.next();
                float c = p.CalcolaCosto(d, f, n);
                if (costo == 0 || costo > c) {
                    costo = c;
                }
            } catch (RemoteException ex) {
                Logger.getLogger(CompositeCustomer.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            return costo;
        
             }

  

    public float CalcolaMalusRestituzione(DescrizioneInterface d, FormatoInterface f, int giorni) throws RemoteException {
          try {
            return CalcolaMalusRestituzione(DescrizioneDAO.loadDescrizioneByORMID(d.getORMID()), FormatoDAO.loadFormatoByORMID(f.getORMID()), giorni);
        } catch (PersistentException ex) {
            Logger.getLogger(NormalePagamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
     public float CalcolaMalusRestituzione(Descrizione d, Formato f, int giorni) {
        float costo;
        costo= (d.getCosto()+ malus_restituzione +f.getCosto())*giorni;
        return costo;
    }
    public float CalcolaMalusPrenotazione(DescrizioneInterface d, FormatoInterface f, int giorni) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}