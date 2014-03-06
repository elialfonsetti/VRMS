package entity;

import interfacce_remote.entity.DescrizioneInterface;
import interfacce_remote.entity.FormatoInterface;
import interfacce_remote.entity.PagamentoInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.orm.PersistentException;

public class ScontoNatale extends UnicastRemoteObject implements PagamentoInterface {
        private int malus_restituzione=1;
        private int malus_prenotazione=1;
        private int bonus_prenotazione=1;
	private Date data_inizio;
	private Date data_fine;
        private float sconto_natale= 1.7f;

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
    public Date getData_fine() {
        return data_fine;
    }

    public void setData_fine(Date data_fine) {
        this.data_fine = data_fine;
    }

    public Date getData_inizio() {
        return data_inizio;
    }

    public void setData_inizio(Date data_inizio) {
        this.data_inizio = data_inizio;
    }

    public ScontoNatale()throws RemoteException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d = new Date();
        String miaData = "20/12/2011";
        GregorianCalendar c = new GregorianCalendar();
        try{
          c.setTime(sdf.parse(miaData));
          data_inizio=c.getTime();
        }
        catch (ParseException e){
          e.printStackTrace();
        }

        String miaData1 = "06/01/2012";
        GregorianCalendar c1 = new GregorianCalendar();
        try{
          c1.setTime(sdf.parse(miaData1));
          data_fine=c1.getTime();
        }
        catch (ParseException e){
          e.printStackTrace();
        }

    }
    public float CalcolaCosto(Descrizione d,Formato f,int num_giorni) {
           System.out.print("NATALE");
           float costo;
           costo= (d.getCosto() +f.getCosto()) *num_giorni;
           costo= costo / sconto_natale;
           
           
           return costo;

        }

    public float CalcolaCosto(DescrizioneInterface d, FormatoInterface f, int n) throws RemoteException {
        try {
            Descrizione desc;
            try {
                desc = DescrizioneDAO.loadDescrizioneByORMID(d.getORMID());
                Formato formato = FormatoDAO.getFormatoByORMID(f.getORMID());
                 return this.CalcolaCosto(desc, formato, n);
            } catch (PersistentException ex) {
                Logger.getLogger(ScontoNatale.class.getName()).log(Level.SEVERE, null, ex);
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