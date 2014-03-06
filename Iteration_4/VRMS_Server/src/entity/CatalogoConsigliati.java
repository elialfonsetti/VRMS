package entity;

import interfacce_remote.entity.DescrizioneInterface;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.orm.PersistentException;

public class CatalogoConsigliati extends Catalogo {
      

    public CatalogoConsigliati() throws RemoteException {
    }

    public ArrayList<DescrizioneInterface> caricaCatalogo(){
        Descrizione[] l=null;
        ArrayList al = null;
        try {
            l = DescrizioneDAO.listDescrizioneByQuery("consigliato = 1", "titolo");
        } catch (PersistentException ex) {
            Logger.getLogger(CatalogoConsigliati.class.getName()).log(Level.SEVERE, null, ex);
        }

        al = new ArrayList(Arrays.asList(l));


        return al;
    }



}